package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
public class Person {
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", personAddress=" + personAddress + ", personPhone=" + personPhone + "]";
	}
	@Id
	private int personId;
	private String personName;
	private int personAge;
	private String personAddress;
	private long personPhone;
	
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
	public long getPersonPhone() {
		return personPhone;
	}
	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}
}
