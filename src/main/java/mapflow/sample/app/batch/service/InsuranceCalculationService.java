package mapflow.sample.app.batch.service;

import mapflow.sample.app.googleapi.model.Location;

public interface InsuranceCalculationService {

	/**
	 * Calculates and returns the total sum insured for a specific area delimeted by
	 * two points: northwest and southeast coordinates.
	 * 
	 * @param northwest
	 * @param southeast
	 * @return
	 */
	public long getTotalSumInsured(Location northwest, Location southeast);
	
	/**
	 * Calculates and returns the total sum insured for a specific area delimeted by
	 * two points: northwest and southeast coordinates, and according to the policy
	 * number given.
	 * 
	 * @param policyNumber
	 * @param northwest
	 * @param southeast
	 * @return
	 */
	public long getTotalSumInsured(Integer policyNumber, Location northwest, Location southeast);
}
