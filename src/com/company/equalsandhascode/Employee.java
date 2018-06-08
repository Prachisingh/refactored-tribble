package com.company.equalsandhascode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by prasingh on 29/5/18.
 */
public class Employee {
	int id;
	int mobile=10;

	public Employee(int id) {
		this.id = id;
	}
	public static void add(){
		Employee e = new Employee(2);
		e.mobile=10;
	}

	@Override
	public int hashCode() {
		return 2;
	}


	@Override
	public boolean equals(Object obj) {
			return obj instanceof Employee && id== ((Employee)obj).id;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);


		HashMap<Employee , String> map = new HashMap<>();
		map.put(emp1,"Jack");
		map.put(emp2,"Jack");
		System.out.println("map's size is " + map.size());
		System.out.println("map's content is " + map.entrySet());
	}
}
