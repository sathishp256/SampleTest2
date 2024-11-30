package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapRevision {

	public static void main(String[] args) {
		
		//declaring hashmap
		
		HashMap hm1=new HashMap();
		
		Map mm2=new HashMap();
		
		HashMap <Integer,Object>hm3=new HashMap<Integer,Object>();
		
		hm3.put(101, "Sathish");
		
		//adding values to hashmap
		
		hm1.put(101, "TOM");
		hm1.put(102, "CAM");
		hm1.put(103, "COT");
		hm1.put(104,  "WET");
		
		
		//size of the hashmap
		
		System.out.println(hm1.size());
		
		//removing
		
		hm1.remove(104);
		System.out.println(hm1);
		
		//get the value
		
		System.out.println(hm1.get(101));
		
		//clear the values
		
		//hm1.clear();
		//System.out.println(hm1);
		
		//for each loop
		for(Object i1:hm1.keySet()) {
			System.out.println(hm1.get(i1));
		}
		
		//to print the keys from hashmap
		
		System.out.println(hm1.keySet());
		
		//to print values from the hashmap
		
		System.out.println(hm1.values());
		
		// to pront both keys and values
		
		System.out.println(hm1.entrySet());
		

	}

}
