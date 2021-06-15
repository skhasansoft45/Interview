package java8.concept.methodreference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList(new String[] { "India", "Chaina", "Russia", "Nepal" }));

		// Using method reference
		list.stream().forEach(System.out::println);

		System.out.println("===========================================");

		// Using lambda expression
		list.stream().forEach(country -> System.out.println(country));
		
		System.out.println("===========================================");

		// Using anonymous class

		list.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String country) {

				System.out.println(country);
			}

		});

	}

}
