package spring_day4;

public class Chocolate {
	private int chocolateId;
	private String chocolateName;
	private String chocolateBrand;
	private String chocolateFlavour;
	private double chocolatePrice;

	public Chocolate(int chocolateId, String chocolateName, String chocolateBrand, String chocolateFlavour,
			double chocolatePrice) {

		this.chocolateId = chocolateId;
		this.chocolateName = chocolateName;
		this.chocolateBrand = chocolateBrand;
		this.chocolateFlavour = chocolateFlavour;
		this.chocolatePrice = chocolatePrice;

	}

	@Override
	public String toString() {
		return "Chocolate [chocolateId=" + chocolateId + ", chocolateName=" + chocolateName + ", chocolateBrand="
				+ chocolateBrand + ", chocolateFlavour=" + chocolateFlavour + ", chocolatePrice=" + chocolatePrice
				+ "]";
	}

}
