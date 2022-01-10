package implementations;

import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Predicate<Integer> lessThanAHundred = i -> (i < 100);
		
		System.out.println(lessThanAHundred.test(10));
		
		Predicate<Integer> moreThanTen = i -> (i > 10);
		
		boolean res = lessThanAHundred.and(moreThanTen).test(25);
		System.out.println(res);
		boolean res2 = lessThanAHundred.and(moreThanTen).test(9);
		System.out.println(res2);
		boolean res3 = lessThanAHundred.and(moreThanTen).negate().test(25);
		System.out.println(res3);
		
		predFunc(17, moreThanTen);
	}	
	
	public static void predFunc(int num, Predicate<Integer> predicate) {
		if(predicate.test(num)) {
			System.out.println("Number " + num);
		}
	}
}