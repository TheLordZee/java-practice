package implementations;
import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		Integer v1 = null;
		Integer v2 = 12;
		Optional<Integer> i = Optional.ofNullable(v1);
		if(i.isPresent()) {
			System.out.println("Number is there");
		} else {
			System.out.println("Number is not there");
		}
		
		Optional<Integer> i2 = Optional.ofNullable(v2);
		if(i2.isPresent()) {
			System.out.println("Number is there");
		} else {
			System.out.println("Number is not there");
		}
	}
}
