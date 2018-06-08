package com.company.threadsafety;

/**
 * Created by prasingh on 8/6/18.
 *
 */
public class HappyBusService {
	public static void main(String[] args) {
		BusRegistration br = new BusRegistration();
		CustomerThread t1 = new CustomerThread(2,"Jack",br);
		CustomerThread t2 = new CustomerThread(2,"Sam",br);
		t1.start();
		t2.start();

	}
}
