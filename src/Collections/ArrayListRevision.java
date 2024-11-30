package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRevision {

	public static void main(String[] args) {
		
		//creation of arraylist
		
		ArrayList al1=new ArrayList();
		
		List l22=new ArrayList();
		
		// storing data into arraylist
		
		al1.add(100);
		al1.add("Sathish");
		al1.add('A');
		al1.add(null);
		al1.add("Sathish");
		al1.add(null);
		
		System.out.println(al1);
		
		// removing values from arraylist
		
		al1.remove(4);
		System.out.println(al1);
		
		// adding values at last of arraylist
		
		al1.add("Sathish");
		
		System.out.println(al1);
		
		//adding values inbetween
		
		al1.add(0,"RRR");
		System.out.println(al1);
		
		//replace the value from arraylist
		
		al1.set(2, "Bhargav");
		System.out.println(al1);
		
		//getting the value based on index'
		
		System.out.println(al1.get(2));
		
		//size of arraylist
		
		System.out.println(al1.size());
		
		//printing the values from arraylist
		//for loop
		
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		
		//for each
		
		for(Object e:al1)
		{
			System.out.println(e);
		}
		
		//Iterator
		
		Iterator <Object>it=al1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//is arraylist empty or not
		
		System.out.println(al1.isEmpty());
		
		//to clear all objects from arraylist
		
		//al1.clear();
		
		//System.out.println(al1);
		
		//to remove multiple objects from arraylist
		
		//al1.removeAll(al1);
		
		//System.out.println(al1);
		
		// there is way to remove multiple elements from arraylist is adding the elements which you wanted to remove into another arraylist and remove it
		
		
		ArrayList al2=new ArrayList();
		
		al2.add(null);
		al2.add("Sathish");
		al2.add(al2);
		
		al1.removeAll(al2);
		
		System.out.println(al1);
		
		//creating arraylist to store homogenous data
		
		ArrayList <Integer>al3=new ArrayList<Integer>();
		
		al3.add(100);
		
		Iterator it2=al3.iterator();
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		
		}
		
		
		
		
	}

}
