package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);

		// Traditional Way

		/*
		 * Collections.sort(list); //Ascending Order Collections.reverse(list);
		 * //Descending Order System.out.println(list);
		 */

		// Using stream api

		/*
		 * list.stream().sorted().forEach(s->System.out.println(s)); //Ascending Order
		 * 
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(s ->
		 * System.out.println(s)); // Descending Order
		 */
		// Below methods are traditional way

		List<Employee> employees = DataBase.getEmployees();

		// Collections.sort(employees, MyComparator()); //Using Outside implementation
		// class

		/*
		 * Collections.sort(employees, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return (int) (o1.getSalary()-o2.getSalary()); // Ascending Order
		 * 
		 * return (int) (o2.getSalary() - o1.getSalary()); // Descending Order }
		 * 
		 * });
		 */

		// Using lambda expression

		//Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary())); // Descending Order
		//Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary())); // ascending Order

		//System.out.println(employees);

		// Using Stream api

		//employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println); // Descending Order
		//employees.stream().sorted((o1,o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::println);   // ascending Order

		//employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println); // Default will take Ascending order
		
		employees.stream().filter(e -> e.getLocation().equals("Hyderabad")).forEach(System.out::println);   //Stream API Very Important For Location
		
		//employees.stream().filter(e -> e.getDept().equals("Developer") && e.getSalary()>=1000000).forEach(System.out::println);
		
		/*
		 * // System.out.println("----------------------------------"); //
		 * System.out.printf("%10s %10s %10s", "EMPLOYEE ID", "NAME", "SALARY"); //
		 * System.out.println(); // // //iterates over the list // for(Employee
		 * employee: employees) // { // System.out.format("%10s %10s %10s",
		 * employee.getId(), employee.getName(), employee.getSalary()); //
		 * System.out.println(); // } // //
		 * System.out.println("----------------------------------");
		 */

	}

}

/*
 * class MyComparator implements Comparator<Employee>{
 * 
 * @Override public int compare(Employee o1, Employee o2) {
 * 
 * //return (int) (o1.getSalary()-o2.getSalary()); // Ascending Order
 * 
 * return (int) (o2.getSalary()-o1.getSalary()); // Descending Order }
 * 
 * 
 * }
 */
