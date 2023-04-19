package gov.pension.repository;

import gov.pension.entity.MstDrRate;
import gov.pension.exception.PensionException;


public interface MstDrRateRepo {
	public MstDrRate saveMstDrRate(MstDrRate drRate) throws PensionException;
	
}
