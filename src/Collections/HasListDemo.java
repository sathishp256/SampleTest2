package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasListDemo {

	public static void main(String[] args) {

		//declaration
		HashSet myset=new HashSet();
		
		//Set mysett=new HashSet();
		
		//HashSet <String>myset=new HashSet<String>();
		
		//assigning values to hashset
		
		myset.add(100);
		myset.add("Welcome");
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		//removing value 
		myset.remove('A');
		System.out.println(myset);
		//getting values from hashset by converting the hashset to array list as work around
		ArrayList a1=new ArrayList(myset);
		
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		//reading all values from hashset
		for(Object e:myset) 
		{
			System.out.println(e);
		}
		//iterator
		
		System.out.println(myset.size()); // to get the size
		System.out.println(myset.isEmpty()); // to check empty or not
		
		Iterator it=myset.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		//to remove all values
		
		myset.clear();
		
		System.out.println(myset);
		
		System.out.println(myset.isEmpty());
		
	}

}
