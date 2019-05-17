package com.guru99.qa.tests;

import java.util.ArrayList;

public class Collections {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> ar = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Shalu", 27);
		Employee e2 = new Employee("Mohan", 30);
		
		ar.add(e1);
		ar.add(e2);
		
		System.out.println(ar.get(0).age);
		System.out.println(ar.get(0).name);
//		System.out.println(ar.get(2));
//		
//		System.out.println(ar.size());
	}

}
