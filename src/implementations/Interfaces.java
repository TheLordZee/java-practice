package implementations;

import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface Square{
	int calculate(int x);
}


interface TestInterface {
	public void add(int a, int b);
	
	default void show() {
		System.out.println("Default method");
	}
	
	public static void showStatic() {
		System.out.println("Static method");
	}
}

class TestClass implements TestInterface {
	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

public class Interfaces {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(7);
		numbers.add(69);
		numbers.add(42);
		numbers.add(420);
		
		Square s = (int x) -> x*x;
		
		//Functional interface
		numbers.stream().sorted().forEach(num -> {
			System.out.println(s.calculate(num));
		});
				
		//Default Methods
		System.out.println("\n----------------------------------\n");
		TestClass test = new TestClass();
		test.add(10, 15);
		test.show();
				
		//Static Methods
		TestInterface.showStatic();
		
		//Supplier and Consumer
		System.out.println("\n----------------------------------\n");
		Supplier<Double> randomValue = () -> Math.random();
		Consumer<Double> display = i -> System.out.println(i);
		display.accept(randomValue.get());
		
	}
}