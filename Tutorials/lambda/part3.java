package lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

public class part3 {
	
	
	public static void main(String[] args) {
		String[] words = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

		System.out.printf("Original strings: %s ", Arrays.asList(words));
		
		System.out.println();
		
		//--------------------------------------------
		
		System.out.printf("Strings in uppercase: %s ", 
							Arrays.stream(words)
							.map(String::toUpperCase)
							.collect(Collectors.toList()) );
		
		System.out.println();
		
		//--------------------------------------------
		
		System.out.printf("Strings greater than m sorted ascending %s ",
				Arrays.stream(words)
				.filter(s -> s.compareToIgnoreCase("n") < 0)
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList())
				);
		
		System.out.println();
		
		//--------------------------------------------
		
		System.out.printf("Strings greater than m sorted descending %s ",
				Arrays.stream(words)
				.filter(s -> s.compareToIgnoreCase("n") < 0)
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.collect(Collectors.toList())
				);
		
		
	}

}
