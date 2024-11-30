package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//declaration
		
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		
		Map mm=new HashMap();
		
		// adding values
		
		hm.put(101, "Sathish");
		hm.put(102, "Bhargav");
		hm.put(103, "Srinivas");
		hm.put(102, "Kumar");
		
		System.out.println(hm);
		
		// size 
		
		System.out.println(hm.size());
		
		//removing data
		
		hm.remove(103);
		System.out.println(hm);
		
		// accesing value 
		System.out.println(hm.get(101));
		
		//printing all keys from hashset
		
		System.out.println(hm.keySet());
		
		// printing all values
		
		System.out.println(hm.values());
		
		// printing all keys and values
		
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		
		//for each
		
		//for(int k:hm.keySet()) {
			
			//System.out.println(k+ "   " +hm.get(k));
			
		//}
			

	}

}
