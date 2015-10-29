package com.training.concepts;

import java.util.ArrayList;
import java.util.List;

public class ToyotaCarImplementing {
	
	public static void main(String arg[]) { 
		
		
		List<Toyota> toyotaCarUSA = new ArrayList<Toyota>(); 
		Toyota toyotacar = new Toyota();
		toyotacar.setCompanyName("Toyota USA");
		toyotacar.setHeadquarters("Michigan");
		String toyotamodels[] = { "camry","prius","lexus"};
		toyotacar.setModels(toyotamodels);
		toyotaCarUSA.add(toyotacar);
		
		Car<Toyota> carInfo = new Car<Toyota>(toyotaCarUSA);
		
		

		 List toyotaCars = (List)carInfo.getCars("toyota");
		 for( int  i = 0 ; i < toyotaCars.size(); i ++) { 
			  Toyota toyota = (Toyota) toyotaCars.get(i);
			  System.out.println("Models of Toyota are ");
			  String models[] = toyota.getModels();
			  for( int modelsIndex = 0 ; modelsIndex < models.length ; modelsIndex  ++) { 
				  System.out.println(models[modelsIndex]);
			  }
			  
		 }
		
	}

}
