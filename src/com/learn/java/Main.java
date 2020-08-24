package com.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	/**
	 * Create a a Theatre class that contains name and ArrayList of seats as fields
	 * For that you need to create a Seat class with seatNumber, price and reserved as fields
	 * 
	 * The Theatre class constructor need numberOfRows and seatsPerRow beside the name as parameters
	 * Find a way to fill the Theatre with seats of 8 rows and 12 seats per row
	 * The seats name must be A01, A02, A03, ..., H12 as 'A' is the row and '01' as the seat number
	 * 
	 * The front seats as A01, A02 ... are more expensive than the others seats
	 * 
	 * Create method that makes you reserve a seat
	 * Create a method that makes you cancel seat reservation
	 * 
	 * Bonus:
	 * Try to sort the seats Theatre in both random and reverse order
	 * find out the max and min number of seats
	 */
	public static void main(String[] args) {

		Theatre theatre = new Theatre("Olumpian", 8, 12);
		
		System.out.println("/*--- Reserve seat ---*/");
		if(theatre.reserveSeat("B05")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry seat is already reserved");
		}
		
		if(theatre.reserveSeat("B05")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry seat is already reserved");
		}
		theatre.reserveSeat("B60");
	
		System.out.println("/*--- Seats copy ---*/");
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.getSeats());
		printList(seatCopy);
		
		System.out.println("/*--- Reverse Seats copy order ---*/");
		Collections.reverse(seatCopy);
		printList(seatCopy);
		
		System.out.println("/*--- Sort Seats copy order ---*/");
		Collections.sort(seatCopy);
		printList(seatCopy);
		
		System.out.println("/*--- Random Seats copy order ---*/");
		Collections.shuffle(seatCopy);
		printList(seatCopy);
		
		System.out.println("/*--- Seats copy max value ---*/");
		Theatre.Seat minSeat = Collections.min(seatCopy);
		System.out.println("Min seat = " + minSeat.getSeatNumber());
		
		System.out.println("/*--- Seats copy min value ---*/");
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("Max seat = " + maxSeat.getSeatNumber());
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.println(" " + seat.getSeatNumber() + " " +seat.getPrice() + "$");
		}
	}
}