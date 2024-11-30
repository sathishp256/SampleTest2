package Collections;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		
		//Map mm=new HashMap();
		
		hm.put(101, "Sathish");
		hm.put(102, "Kumar");
		hm.put(103, "Bhatrgav");
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.get(102));
		
		hm.remove(102);
		System.out.println(hm);
		
		//hm.clear();
		
		System.out.println(hm.values());
		
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		
		for(Object
				l:hm.keySet())		
		{
			System.out.println(hm.get(l));
		}
	}

}
