package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	private long personPhone;
	private int personAge;
	private String personAddress;
	
	@OneToOne
	private AadharCard aadharCard;
	

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public long getPersonPhone() {
		return personPhone;
	}
	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public AadharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personPhone=" + personPhone
				+ ", personAge=" + personAge + ", personAddress=" + personAddress + ", aadharCard=" + aadharCard + "]";
	}
	

}
