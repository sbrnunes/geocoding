package mapflow.sample.app;

import mapflow.sample.app.batch.service.InsuranceCalculationService;
import mapflow.sample.app.googleapi.model.Location;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:spring-application-context.xml"
})
public class TotalSumInsuranceCalculationTest {

	@Autowired
	private InsuranceCalculationService service;
	
	private Location northwest;
	private Location southeast;
	private Location singlePointCoords1;
	private Location singlePointCoords2;

	private int policyNumber1;
	private int policyNumber2;
	
	@Before
	public void init() {
		/*
		 * The rectangle coordinates
		 */
		northwest = new Location();
		northwest.setLat("53.819680");
		northwest.setLng("6.723633");
		
		southeast = new Location();
		southeast.setLat("47.923214");
		southeast.setLng("14.809570");
		
		/*
		 * Single points coordinates from the CSV file
		 */
		singlePointCoords1 = new Location();
		singlePointCoords1.setLat("53.686306");
		singlePointCoords1.setLng("8.017667");
		
		singlePointCoords2 = new Location();
		singlePointCoords2.setLat("49.855801");
		singlePointCoords2.setLng("18.260017");
		
		policyNumber1 = 1000000;
		policyNumber2 = 1000001;
		
	}
	
	/**
	 * Calculates the sum of total insurance for a specific area by making a sum
	 * of all total sum insurance fields found inside that given area. 
	 * Checks if the calculated value is equal to the expected value.
	 */
	@Test
	public void testCalculateAreaTotalSumInsurance() {
		long totalSumInsured = service.getTotalSumInsured(northwest, southeast);
		Assert.assertEquals(89755461, totalSumInsured);
	}
	
	@Test
	public void testCalculateAreaTotalSumInsuranceByPolicyNumber() {
		long totalSumInsured1 = service.getTotalSumInsured(policyNumber1, northwest, southeast);
		Assert.assertEquals(75554110, totalSumInsured1);
		
		long totalSumInsured2 = service.getTotalSumInsured(policyNumber2, northwest, southeast);
		Assert.assertEquals(14201351, totalSumInsured2);
	}
	
	/**
	 * Calculates the sum of total insurance for a specific point.
	 * Checks if the calculated value is equal to the expected value.
	 */
	@Test
	public void testCalculateSinglePointTotalSumInsurance() {
		long totalSumInsured = service.getTotalSumInsured(singlePointCoords1, singlePointCoords1);
		Assert.assertEquals(75554110, totalSumInsured);
	}
	
	/**
	 * Calculates the sum of total insurance for a specific point.
	 * Checks if the calculated value is equal to the expected value.
	 */
	@Test
	public void testCalculateSinglePoint2TotalSumInsurance() {
		long totalSumInsured = service.getTotalSumInsured(singlePointCoords2, singlePointCoords2);
		Assert.assertEquals(4921233, totalSumInsured);
	}
	
	
}
