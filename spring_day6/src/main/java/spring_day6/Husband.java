package spring_day6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Husband {
	@Value("1")
	private int husbandId;
	@Value("Allu Arjun")
	private String husbandName;
	@Value("45")
	private int husbandAge;
	@Value("1200000")
	private double husbandSalary;
	
	@Autowired
	private Wife wife;

	public int getHusbandId() {
		return husbandId;
	}

//	public void setHusbandId(int husbandId) {
//		this.husbandId = husbandId;
//	}

	public String getHusbandName() {
		return husbandName;
	}

//	public void setHusbandName(String husbandName) {
//		this.husbandName = husbandName;
//	}

	public int getHusbandAge() {
		return husbandAge;
	}

//	public void setHusbandAge(int husbandAge) {
//		this.husbandAge = husbandAge;
//	}

	public double getHusbandSalary() {
		return husbandSalary;
	}

//	public void setHusbandSalary(double husbandSalary) {
//		this.husbandSalary = husbandSalary;
//	}

	public Wife getWife() {
		return wife;
	}

//	public void setWife(Wife wife) {
//		this.wife = wife;
//	}	
}
