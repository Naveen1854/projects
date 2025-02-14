package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharid;
	private long aadharNumber;
	private String aadharauthority;
	
	
	public int getAadharid() {
		return aadharid;
	}
	public void setAadharid(int aadharid) {
		this.aadharid = aadharid;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getAadharauthority() {
		return aadharauthority;
	}
	public void setAadharauthority(String aadharauthority) {
		this.aadharauthority = aadharauthority;
	}

	@Override
	public String toString() {
		return "AadharCard [id=" + aadharid + ", aadharNumber=" + aadharNumber + ", authority=" + aadharauthority + "]";
	}
	
}
