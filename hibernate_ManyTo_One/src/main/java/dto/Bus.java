package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busId;
	private long busNumber;
	private String busColor;
	private String busType;
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public long getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(long busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusColor() {
		return busColor;
	}
	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busNumber=" + busNumber + ", busColor=" + busColor + ", busType=" + busType
				+ "]";
	}
	
}
