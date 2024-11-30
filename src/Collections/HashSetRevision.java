package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRevision {

	public static void main(String[] args) {
		
		//declaring the hashset
		
		HashSet hs1=new HashSet();
		
		Set s11=new HashSet();
		
		//adding the values to hashset
		
		hs1.add(100);
		hs1.add('A');
		hs1.add("Sathish");
		hs1.add(null);
		hs1.add('A');
		hs1.add(null);
		
		System.out.println(hs1);
		
		//to get the size of hashset
		
		System.out.println(hs1.size());
		
		//removing the values from hash set
		
		hs1.remove(null);
		System.out.println(hs1);
		
		//converting hash set into arraylist to get the values based on index
		
		ArrayList al5=new ArrayList(hs1);
		
		System.out.println(al5.get(1));
		
		al5.add("Sathish");
		al5.add(200);
		
		System.out.println(al5);
		
		//printing the values from hashset for each
		
		for(Object e1:hs1) {
			System.out.println(e1);
		}
		
		//iterator
		
		Iterator at2=hs1.iterator();
		
		while(at2.hasNext()) {
			System.out.println(at2.next());
		}
		
		// to remove all values from hashset
		
		hs1.clear();
		System.out.println(hs1);
		
		
	}

}
