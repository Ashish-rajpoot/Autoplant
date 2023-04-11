package demo.q18;

public class Employee {

	private final String name;
	private final double salary;
	private final String deparment;
	
	
	public Employee(String name, double salary, String deparment) {
		super();
		this.name = name;
		this.salary = salary;
		this.deparment = deparment;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDeparment() {
		return deparment;
	}

	
}
