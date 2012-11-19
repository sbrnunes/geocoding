package mapflow.sample.app;

import mapflow.sample.app.googleapi.model.Geometry;
import mapflow.sample.app.googleapi.model.GoogleGeocodeOutput;
import mapflow.sample.app.googleapi.model.Result;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:spring-application-context.xml",
		"classpath:test-spring-persistence-context.xml"
})
public class GeographicalDataQueryingTest {

	@Autowired
	private RestTemplate restTemplate;
	
	private String address;
	private GoogleGeocodeOutput output;
	
	@Before
	public void init() {
		address = "Strandweg 7,Horumersiel,26434,DE";
		
		output = restTemplate.getForObject("http://maps.googleapis.com/maps/api/geocode/json?address={address}&sensor=false", 
				GoogleGeocodeOutput.class, address);
	}
	
	@Test
	public void testGoogleGeocodeStatus() {
		Assert.assertNotNull(output);
		Assert.assertNotNull(output.getStatus());
		Assert.assertEquals("OK", output.getStatus());
	}
	
	@Test
	public void testGoogleGeocodeResults() {
		Assert.assertNotNull(output);
		Assert.assertNotNull(output.getStatus());
		Assert.assertTrue(output.getResults().size() > 0);
	}
	
	@Test
	public void testGoogleGeocodeGeometry() {
		
		for (Result result : output.getResults()) {
			Geometry geometry = result.getGeometry();
			Assert.assertNotNull(geometry);
		}
	}
	
	@Test
	public void testGoogleGeocodeGeometryLocation() {
		
		for (Result result : output.getResults()) {
			Geometry geometry = result.getGeometry();
			Assert.assertNotNull(geometry.getLocation());
			Assert.assertNotNull(geometry.getLocation().getLat());
			Assert.assertNotNull(geometry.getLocation().getLng());
			
		}
	}
}
