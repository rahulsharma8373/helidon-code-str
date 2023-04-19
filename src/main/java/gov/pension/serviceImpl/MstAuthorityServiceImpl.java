package gov.pension.serviceImpl;

import javax.inject.Inject;

import gov.pension.entity.MstAuthority;
import gov.pension.exception.PensionException;
import gov.pension.repository.MstAuthorityRepo;
import gov.pension.service.MstAuthorityService;

public class MstAuthorityServiceImpl implements MstAuthorityService {

	@Inject
	MstAuthorityRepo authorityRepo;

	@Override
	public MstAuthority saveMstAuthority(MstAuthority authority) throws PensionException {

		return authorityRepo.saveMstAuthority(authority);
	}

}
