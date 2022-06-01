package forEach_expression;

public class Employee100 {
	private String empId;
	private int age;
	private String name;
	private char gender;
	private int salary;

	public String getEmpId() {
		return empId;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp Id: " + getEmpId() + " Name: " + getName() + " Age: " + getAge();
	}

	Employee100(String empId, int age, String name, char gender, int salary) {
		this.empId = empId;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
}