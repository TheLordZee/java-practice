package filter;

public class Employee {
	String name;
	int id;
	int salary;
	static int count = 1;
	int age;
	
	public Employee(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
		id = count;
		count++;
	}
	
	public void display() {
		System.out.println(id + " " + name + " " + salary + " " + age);
	}
}
