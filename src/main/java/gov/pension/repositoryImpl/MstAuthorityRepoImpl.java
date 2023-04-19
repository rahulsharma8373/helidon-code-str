package gov.pension.repositoryImpl;

import java.sql.Timestamp;
import java.time.Instant;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import gov.pension.entity.MstAuthority;
import gov.pension.exception.PensionException;
import gov.pension.repository.MstAuthorityRepo;

@Dependent
public class MstAuthorityRepoImpl implements MstAuthorityRepo{
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	@Override
	public MstAuthority saveMstAuthority(MstAuthority authority) throws PensionException  {
		MstAuthority mstAuthority=new MstAuthority();
		try {
		
		Timestamp instant= Timestamp.from(Instant.now());  
		mstAuthority.setAuthorityId(authority.getAuthorityId());
		mstAuthority.setAuthorityCode(authority.getAuthorityCode());
		mstAuthority.setAuthorityName(authority.getAuthorityName());
		mstAuthority.setNewRvsnFlag(authority.getNewRvsnFlag());
		mstAuthority.setPensionFlag(authority.getPensionFlag());
		mstAuthority.setNoc(authority.getNoc());
		mstAuthority.setPaperType(authority.getPaperType());
		mstAuthority.setIsActive(authority.getIsActive());
		mstAuthority.setCreatedBy(authority.getCreatedBy());
		mstAuthority.setCreatedDt(instant);
		mstAuthority.setModifiedBy(authority.getModifiedBy());
		mstAuthority.setModifiedDt(instant);
		entityManager.persist(mstAuthority);
		}catch (Exception e) {
			throw new PensionException(e.getMessage());
		}
		return mstAuthority;
	}

}
