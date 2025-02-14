package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
//@Table(name = "naveen")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PassengerId;
	private String passengerName;
	private String passengerAddress;
	private long passengerPhone;
	private String passegerGender;

	@ManyToOne
	private Bus bus;

	public int getPassengerId() {
		return PassengerId;
	}

	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerAddress() {
		return passengerAddress;
	}

	public void setPassengerAddress(String passengerAddress) {
		this.passengerAddress = passengerAddress;
	}

	public long getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(long passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPassegerGender() {
		return passegerGender;
	}

	public void setPassegerGender(String passegerGender) {
		this.passegerGender = passegerGender;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "Passenger [PassengerId=" + PassengerId + ", passengerName=" + passengerName + ", passengerAddress="
				+ passengerAddress + ", passengerPhone=" + passengerPhone + ", passegerGender=" + passegerGender
				+ ", bus=" + bus + "]";
	}

}
