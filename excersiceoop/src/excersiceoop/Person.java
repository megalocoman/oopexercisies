package excersiceoop;

public class Person {
	public String name;
	public String address;
	public Person(String name, String address) {
		
		this.name = name;
		this.address = address;
	
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
