package implementations;

import java.util.*;
import java.util.stream.Collectors;

class Student {
	String name;
	int age;
	float gpa;
	
	public Student(String n, int a, float g){
		name = n;
		age = a;
		gpa = g;
	}
}

public class CollectorsClass {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Jack", 17, 3.6f));
		students.add(new Student("Bob", 16, 3.7f));
		students.add(new Student("Jeremy", 18, 3.1f));
		students.add(new Student("Steve", 17, 3.8f));
		students.add(new Student("Anna", 17, 2.9f));
		students.add(new Student("Susan", 16, 3.2f));
		
		List<Float> gpas = students.stream()
								.filter(s -> s.gpa > 3.5f)
								.map(s -> s.gpa)
								.collect(Collectors.toList());
		System.out.println(gpas);
		
		Double average = students.stream()
						.collect(Collectors.averagingDouble(s -> s.gpa));
		
		System.out.println(average);
	}
}
