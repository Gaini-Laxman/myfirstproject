package com;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployees() {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(110, "Laxman", "Developer", "Hyderabad", 1500000));
		list.add(new Employee(111, "Anitha", "Tester","Hyderabad", 1100000));
		list.add(new Employee(112, "Maruthi", "Desiner","Banglore", 500000));
		list.add(new Employee(113, "Sai", "Analyst","Banglore", 400000));
		list.add(new Employee(114, "Raju", "Accountant","Mumbai", 300000));
		list.add(new Employee(115, "Karthik", "Developer","Mumbai", 1200000));
		list.add(new Employee(116, "Naveen", "Developer","Chennai", 1000000));
		list.add(new Employee(117, "Anji", "Analyst","Chennai", 800000));
		list.add(new Employee(118, "Ganesh", "Engineer","Banglore", 900000));
		list.add(new Employee(119, "Vamshi", "Tester","Hyderabad", 600000));
		list.add(new Employee(120, "Vineeth", "Tester","Hyderabad", 700000));
		list.add(new Employee(121, "Anand", "Desiner","Chennai", 400000));

		return list;

	}
}
