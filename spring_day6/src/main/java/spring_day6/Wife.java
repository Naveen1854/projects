package spring_day6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wife {
	@Value("1")
	private int wifeId;
	@Value("Sneha Reddy")
	private String wifeName;
	@Value("40")
	private int wifeAge;
	@Value("1000000")
	private double wifeSalary;
	
	public int getWifeId() {
		return wifeId;
	}
//	public void setWifeId(int wifeId) {
//		this.wifeId = wifeId;
//	}
	public String getWifeName() {
		return wifeName;
	}
//	public void setWifeName(String wifeName) {
//		this.wifeName = wifeName;
//	}
	public int getWifeAge() {
		return wifeAge;
	}
//	public void setWifeAge(int wifeAge) {
//		this.wifeAge = wifeAge;
//	}
	public double getWifeSalary() {
		return wifeSalary;
	}
//	public void setWifeSalary(double wifeSalary) {
//		this.wifeSalary = wifeSalary;
//	}
		
}
