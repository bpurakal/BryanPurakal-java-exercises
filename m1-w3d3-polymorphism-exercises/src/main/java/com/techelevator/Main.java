package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main{
	
	public static void main(String[] args) {
		
		List<Vehicle> tollList = new ArrayList<>();
		
		//int distance = (int)(Math.round(Math.random()* 231 +10)); //range of 10 - 240 bc its initially range of 0-230 but now its lowest 10 and up to 240 with int being truncated
		Random rand = new Random();
		int totalDistance = 0;
		BigDecimal totalToll = new BigDecimal ("0");
		
		//System.out.println(distance);
		Car sedan = new Car(false);
		Truck raptor = new Truck(10);
		Tank hulk = new Tank();
		Car coupe = new Car(true);
		Truck sierra = new Truck(6);
		Tank bryan = new Tank();
		
		tollList.add(sedan);
		tollList.add(raptor);
		tollList.add(hulk);
		tollList.add(coupe);
		tollList.add(sierra);
		tollList.add(bryan);
		
		System.out.println("Vehicle \t \t Distance Traveled \t\t Toll $");
		System.out.println("--------------------------------------------------------");

		for(Vehicle element: tollList) {
			int distance = rand.nextInt(241) + 10; //needs to be inside loop for it to be diff every iteration
			System.out.print(element.getClass().getSimpleName() + "\t\t\t");
			System.out.print(distance + "\t\t\t");
			totalDistance += distance;
			System.out.println("$"+element.calculateToll(distance).setScale(2, RoundingMode.CEILING));
			totalToll = totalToll.add(element.calculateToll(distance).setScale(2, RoundingMode.CEILING));
		}
		
		System.out.printf("\nTotal Distance: %d miles %n%nTotal Revenue:$%.2f", totalDistance, totalToll);
		
		
	}

	

}
