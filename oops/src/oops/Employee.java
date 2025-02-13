package oops;

public class Employee {
	int id;
	String name;
	String address;
	static String companyName = "TCS";

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void code() {
		System.out.println("Coding is fun");
		System.out.println(id + " " + name + " " + address + " " + companyName);

	}

	public static void main(String[] args) {
		Employee employee = new Employee(1, "banu", "Hyd");
		employee.code();
	}
}
