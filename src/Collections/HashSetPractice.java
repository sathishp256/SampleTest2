package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet h1=new HashSet();
		
		//Set s1=new HashSet();
		
		h1.add(100);
		h1.add("Sathish");
		h1.add('D');
		h1.add(null);
		h1.add(null);
		
		System.out.println(h1);
		
		System.out.println(h1.size());
		
		h1.remove(100);
		
		System.out.println(h1);
		
		ArrayList a1=new ArrayList(h1);
		
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		
		for(Object e1:h1)
		{
			System.out.println(e1);
		}
		
		Iterator i2=h1.iterator();
		
		while(i2.hasNext()) 
		{
			System.out.println(i2.next());
		}
		
		h1.clear();
		
		System.out.println(h1);
		
		

	}

}
