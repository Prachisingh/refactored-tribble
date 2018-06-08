package com.company.upcasting;

/**
 *
 * Created by prasingh on 28/5/18.
 */
public class Mobile {

	public void calling(){
		System.out.println("Inside Parent class");
	}
}

class Samsung extends Mobile{
	@Override
	public void calling() {
		System.out.println("Inside Child class");
	}
	public void camera(){
		System.out.println("Inside camera");
	}

	public static void main(String[] args) {
		Samsung s1 = new Samsung();

		Mobile m= (Mobile) s1;
		m.calling();
		//int ss= Integer.parseInt("1");
//		m.camera(); // This wont work

	}
}
