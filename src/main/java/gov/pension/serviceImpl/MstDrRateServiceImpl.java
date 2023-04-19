package gov.pension.serviceImpl;

import javax.inject.Inject;


import gov.pension.entity.MstDrRate;
import gov.pension.exception.PensionException;
import gov.pension.repository.MstDrRateRepo;
import gov.pension.service.MstDrRateService;


public class MstDrRateServiceImpl implements MstDrRateService{

	@Inject
	MstDrRateRepo drRateRepo;
	
	
	
	@Override
	public MstDrRate saveMstDrRate(MstDrRate drRate) throws PensionException{
				return drRateRepo.saveMstDrRate(drRate);
	}

	
	
}
