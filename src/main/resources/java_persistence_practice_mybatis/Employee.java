package java_persistence_practice_mybatis;

public class Employee {
	private int ID;
	private String name;
	private int age;
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(int iD, String name, int age) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
