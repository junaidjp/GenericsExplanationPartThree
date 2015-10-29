package com.training.concepts;

import java.util.List;

public class Car<T> {
	
	public List<T> cars ;
	 
	public Car(List<T> cars){
		this.cars = cars;
	}
 
	public Object getCars(String carName) {
	
		System.out.println("Now we will return the "+carName+" Objects");
		 return cars;
	}
 
}


