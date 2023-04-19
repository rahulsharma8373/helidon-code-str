package gov.pension.repository;

import gov.pension.entity.MstAuthority;
import gov.pension.exception.PensionException;

public interface MstAuthorityRepo {

	public MstAuthority saveMstAuthority(MstAuthority authority) throws PensionException;
	
}
