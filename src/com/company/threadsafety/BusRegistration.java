package com.company.threadsafety;

/**
 *
 * Created by prasingh on 8/6/18.
 */
 class BusRegistration implements Runnable {
	private int totalSeats=2;

	@Override
	public void run() {
		CustomerThread ct = (CustomerThread) Thread.currentThread();
		boolean bookedTickets= this.bookTickets(ct.seatsRequested,ct.getName());
		if(bookedTickets){
			System.out.println("Congrats " +Thread.currentThread().getName() + " Number of seats booked is " + ct.getSeatsRequested());
		}
		else {
			System.out.println("Sorry " +Thread.currentThread().getName() + " Number of seats booked is " + this.getAvailableSeats());
		}

	}

	private synchronized boolean bookTickets(int seatsRequested , String name) {
		System.out.println("Welcome to happy bus service " + Thread.currentThread().getName()+ "Number of seats available are : "+ this.getAvailableSeats());
		if(seatsRequested>this.getAvailableSeats()){
			return false;
		}
		else{
		totalSeats=totalSeats-seatsRequested;
		}
		return true;
	}

	public int getAvailableSeats() {
		return totalSeats;
	}
}
