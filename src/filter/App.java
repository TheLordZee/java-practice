package filter;
import java.util.*;

public class App {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Jack", 25, 60000));
		employees.add(new Employee("Becky", 42, 110000));
		employees.add(new Employee("David", 50, 150000));
		employees.add(new Employee("Leanne", 28, 53000));
		employees.add(new Employee("Steve", 22, 70000));
		
		//Without streams
		for(Employee e : employees) {
			if(e.salary > 100000 
					&& e.age > 30 
					&& (e.name.charAt(0) == 'B' 
						|| e.name.charAt(0) == 'D')
			) {
				e.display();
			}
		}
		
		//With streams
		employees.stream()
					.filter(e -> e.salary > 100000 
							&& e.age > 30 
							&& (e.name.charAt(0) == 'B' 
							|| e.name.charAt(0) == 'D'))
					.forEach(e -> e.display());
	}
}
