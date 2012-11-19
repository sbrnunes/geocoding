package mapflow.sample.app.batch.persistence.jpa.impl;

import java.text.MessageFormat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mapflow.sample.app.batch.persistence.jpa.GeographicalDataRepository;
import mapflow.sample.app.googleapi.model.Location;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class JpaGeographicalDataRepository implements GeographicalDataRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public long getSumTotalSumInsured(Location northwest, Location southeast) {
		
		MessageFormat pattern = new MessageFormat(
			"select sum(totalSumInsured) " +
			"from GeographicalData " +
			"where " +
			"latitude >= {0} and latitude <= {1} and " +
			"longitude >= {2} and longitude <= {3}");
		
		Query query = em.createQuery(pattern.format(
			new Object[] {
				southeast.getLat(), //bottom right latitude
				northwest.getLat(), //top left latitude
				northwest.getLng(), //top left longitude
				southeast.getLng()  //bottom right longitude
			}
		));
		
		return (Long)query.getSingleResult();
	}
	
	@Override
	public long getSumTotalSumInsured(Integer policyNumber, Location northwest,
			Location southeast) {
		
		MessageFormat pattern = new MessageFormat(
				"select sum(totalSumInsured) " +
				"from GeographicalData " +
				"where " +
				"policyNumber = {0} and " +
				"latitude >= {1} and latitude <= {2} and " +
				"longitude >= {3} and longitude <= {4}");
			
			Query query = em.createQuery(pattern.format(
				new Object[] {
					policyNumber.toString(),
					southeast.getLat(), //bottom right latitude
					northwest.getLat(), //top left latitude
					northwest.getLng(), //top left longitude
					southeast.getLng()  //bottom right longitude
				}
			));
			
			return (Long)query.getSingleResult();
	}

}
