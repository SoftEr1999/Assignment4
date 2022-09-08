import java.util.*;

public class HashMap_Values_Squaring {

	public static void main(String[] args) {
	
	
		//HashMap declaration
		HashMap<Integer,Integer> map= new HashMap<>();
		
		//Entering keys and values using for loop
		
		for(int i=1;i<=15;i++)
		{
			map.put(i, i*i);
		}
		
		//Printing the HashMap directly
		System.out.println(map);
		
		//Printing the HashMap Keys and Values using loop
		
		System.out.println("Printing keys and values of Hashmap...");  
		
		   for(Map.Entry m : map.entrySet())
		   {    
			   System.out.println(m.getKey()+" : "+m.getValue());    
		   }  	
		

	}

}
