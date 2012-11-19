package mapflow.sample.app.batch.persistence.jpa;

import mapflow.sample.app.googleapi.model.Location;

public interface GeographicalDataRepository {

	/**
	 * Calculates and returns the total sum insured for a specific area delimeted by
	 * two points: northwest and southeast coordinates.
	 * 
	 * @param northwest
	 * @param southeast
	 * @return
	 */
	public long getSumTotalSumInsured(Location northwest, Location southeast);
	
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
	public long getSumTotalSumInsured(Integer policyNumber, Location northwest, Location southeast);
	
}
