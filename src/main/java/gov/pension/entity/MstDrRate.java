package gov.pension.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MST_DR_RATE")
public class MstDrRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int drRateId;
	private String payCmmsn;
	private int salMin;
	private int salMax;
	private int minAmt;
	private Timestamp effDate;
	private Timestamp appliedDate;
	private int drRate;
	private int drRateFix;
	private int isDp;
	private String drFlag;
	private String isPension;
	private String isGpo;
	private int isActive;
	private int createdBy;
	private Timestamp createdDt;
	private int modifiedBy;
	private Timestamp modifiedDt;

}
