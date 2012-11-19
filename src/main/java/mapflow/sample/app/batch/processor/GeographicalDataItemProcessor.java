package mapflow.sample.app.batch.processor;

import mapflow.sample.app.batch.model.GeographicalData;
import mapflow.sample.app.googleapi.model.GoogleGeocodeOutput;
import mapflow.sample.app.googleapi.model.Location;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

/**
 * This processor gets the latitude and longitude from Google Maps API for each item
 * that has been read from the CSV input file.
 *
 */
public class GeographicalDataItemProcessor implements ItemProcessor<GeographicalData,GeographicalData> {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${google.geocode.service.url}")
	private String googleServiceUrl; 
	
	@Override
	public GeographicalData process(GeographicalData item) throws Exception {
		String query = "";
		query += getValue( item.getAddress1() );
		query += getValue( item.getAddress2() );
		query += getValue( item.getRegion() );
		query += getValue( item.getPostcodeZip() );
		query += getValue( item.getCountry() );
		
		//Call Google Maps API
		GoogleGeocodeOutput output = restTemplate.getForObject(googleServiceUrl, GoogleGeocodeOutput.class, query);
		
		if(CollectionUtils.isEmpty(output.getResults())) {
			//No results were found.
			return item;
		}
		
		if(output.getResults().size() > 1) {
			//More than one result. We cannot know which is the right one.
			return item;
		}
		
		//Get the location and set the coordinates on the item.
		Location location = output.getResults().get(0).getGeometry().getLocation();
		item.setLatitude(Float.parseFloat(location.getLat()));
		item.setLongitude(Float.parseFloat(location.getLng()));
		
		return item;
		
	}

	private String getValue(String value) {
		return !StringUtils.isBlank( value ) ? value + "," : "";
	}
	
}
