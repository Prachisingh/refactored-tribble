package com.company.threadsafety;

/**
 * Created by prasingh on 8/6/18.
 */
public class CustomerThread extends Thread {
	int seatsRequested;
	public CustomerThread(int seatsRequested, String name, Runnable target){
		super(target,name);
		this.seatsRequested= seatsRequested;

	}

	public int getSeatsRequested() {
		return seatsRequested;
	}
}
