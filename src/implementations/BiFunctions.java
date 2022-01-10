package implementations;

import java.util.function.BiFunction;

public class BiFunctions {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x+y;
		System.out.println("Sum:" + add.apply(4, 8));
		
		BiFunction<Integer, Integer, Integer> composite = add.andThen(a -> a*a);
		System.out.println("Sum:" + composite.apply(4, 8));
	}
}