package excersiceoop;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	private int annualsalary;
	
	public Employee(int id, String firstname, String lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public int annualsetSalary() {
		  return salary*12;
		
	}
	public int raiseSalary(int percent) {
		this.salary=  salary*(100+percent)/100;
		return salary;
	}
	public String toString() {
		return "Employee[id= "+id+", name= "+firstname+" "+lastname+", salary= "+salary+"]";
	}
}
