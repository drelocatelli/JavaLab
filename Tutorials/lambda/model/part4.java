package lambda.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class part4 {
	
	public static void main(String[] args) {
		
		Employee[] employees = {
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"),
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing")
		};
		
		List<Employee> list = Arrays.asList(employees);
		
		System.out.println("Complete employee list:");
		list.stream().forEach(employee -> {
			System.out.println(employee);
		});
		
		System.out.println();
		
		// --------------------------------------------------
		
		Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
		System.out.println("Employees earning $4000-$6000 per month sorted by salary:");
		
		list.stream()
			.filter(fourToSixThousand)
			.sorted(Comparator.comparing(Employee::getSalary))
			.forEach(System.out::println);

		System.out.println();
		
		// --------------------------------------------------
		
		System.out.printf("First employee who earns $4000-$6000: \n%s", 
				list.stream()
					.filter(fourToSixThousand)
					.findFirst()
					.get());

		System.out.println();
		
		// --------------------------------------------------
		
		System.out.printf("Unique employee last name: \n");
		list.stream()
			.map(Employee::getLastname)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();

		// --------------------------------------------------
		
		System.out.println("Employee by department");
		Map<String, List<Employee>> grouppedByDepartment = 
				list.stream()
					.collect(Collectors
					.groupingBy(Employee::getDepartment)
				);
		
		grouppedByDepartment.forEach((department, employeesInDepartment) -> {
			System.out.println(department + ":");
			employeesInDepartment.forEach(employee -> System.out.println(employee));
			System.out.println();
			
		});
		
	}

}
