package com.training.concepts;

import java.util.ArrayList;
import java.util.List;

public class NissanCarImplementing {


	public static void main(String arg[]) { 
		
		
		List<Nissan> nissanCarUSA = new ArrayList<Nissan>(); 
		Nissan nissanCar = new Nissan();
		nissanCar.setCompanyName("Nissan UK");
		
		String nissanModels[] = { "nissan Altima","Maxima","370Z"};
		nissanCar.setModels(nissanModels);
		nissanCarUSA.add(nissanCar);
		Car<Nissan> carInfo = new Car<Nissan>(nissanCarUSA);
		
		 List nissanCars = (List)carInfo.getCars("nissan");
		 for( int  i = 0 ; i < nissanCars.size(); i ++) { 
			  Nissan nissan = (Nissan) nissanCars.get(i);
			  System.out.println("Models of Nissan are ");
			  String models[] = nissan.getModels();
			  for( int modelsIndex = 0 ; modelsIndex < models.length ; modelsIndex  ++) { 
				  System.out.println(models[modelsIndex]);
			  }
			  
		 }
		
		
		
		
	}

	
}
