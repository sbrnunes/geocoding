package mapflow.sample.app.batch.service.impl;

import mapflow.sample.app.batch.persistence.jpa.GeographicalDataRepository;
import mapflow.sample.app.batch.service.InsuranceCalculationService;
import mapflow.sample.app.googleapi.model.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InsuranceCalculationServiceImpl implements InsuranceCalculationService {

	@Autowired
	private GeographicalDataRepository repository;
	
	@Override
	public long getTotalSumInsured(Location northwest, Location southeast) {
		return repository.getSumTotalSumInsured(northwest, southeast);
	}
	
	@Override
	public long getTotalSumInsured(Integer policyNumber, Location northwest,
			Location southeast) {
		return repository.getSumTotalSumInsured(policyNumber, northwest, southeast);
	}
}
