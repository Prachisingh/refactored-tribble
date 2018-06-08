package com.company.creatingobjects;

/**
 * Created by Prachi on 23/5/18.
 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		//creating Student object using new operator
		Student s = new Student();

		//printing reference
		System.out.println(s);
		s.id=202;
		System.out.println(s.id);
		System.out.println("******************");
		Student s1 = (Student) Class.forName("com.company.creatingobjects.Student").newInstance();
		Student s2 = Student.class.newInstance();
		System.out.println(s1);
		s1.id=203;
		System.out.println(s1.id);

	}
}
