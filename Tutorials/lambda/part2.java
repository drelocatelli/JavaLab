package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class part2 {

	public static void main(String[] args) {
		
		Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
		
		// exibe valores originais
		System.out.printf("Original values: %s",
				Arrays.asList(values) );
		
		System.out.println();
		
		// classifica os valores em ordem crescente com fluxos
		System.out.printf("Sorted values: %s ",
				Arrays.stream(values)
						.sorted()
						.collect(Collectors.toList()) );
		
		System.out.println();
		
		// valores maiores que 4
		List<Integer> greaterThan4 = 
				Arrays.stream(values)
					.filter(value -> value > 4)
					.sorted()
					.collect(Collectors.toList());
		System.out.printf("Values greater than 4: %s", greaterThan4);

		
	}
	
}
