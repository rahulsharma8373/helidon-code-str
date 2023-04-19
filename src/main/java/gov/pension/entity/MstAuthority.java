package gov.pension.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class MstAuthority {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorityId;
	private String authorityCode;
	private String authorityName;
	private String newRvsnFlag;
	private String pensionFlag;
	private int noc;
	private String paperType;
	private int isActive;
	private int createdBy;
	private Timestamp createdDt;
	private int modifiedBy;
	private Timestamp modifiedDt;
}
