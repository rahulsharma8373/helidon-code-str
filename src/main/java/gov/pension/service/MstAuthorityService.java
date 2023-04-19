package gov.pension.service;

import javax.enterprise.context.Dependent;

import gov.pension.entity.MstAuthority;
import gov.pension.exception.PensionException;

@Dependent
public interface MstAuthorityService{

	public MstAuthority saveMstAuthority(MstAuthority authority) throws PensionException;
	
}
