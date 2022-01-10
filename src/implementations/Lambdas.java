package implementations;

import java.util.ArrayList;
import java.util.List;



public class Lambdas {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(7);
		numbers.add(69);
		numbers.add(42);
		numbers.add(420);
		
		//Default Stream
		System.out.println("\n----------------------------------\n");
		numbers.stream().forEach(num -> {
			System.out.println(num);
		});
		
		//Method reference
		System.out.println("\n----------------------------------\n");
		numbers.stream().forEach(System.out::println);
		
		//Parallel
		System.out.println("\n----------------------------------\n");
		numbers.parallelStream().forEach(System.out::println);
		
	}
}
