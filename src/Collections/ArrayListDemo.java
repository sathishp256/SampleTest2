package Collections;

import java.util.*;
//import java.util.Iterator;
//import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration
		
		//hetrogenous data
		ArrayList mylist=new ArrayList();
		
		//List mylistt=new ArrayList();
		
		//homogenous data
		
		//ArrayList <Integer>mylist2=new ArrayList<Integer>();
		
		//ArrayList <Employee>mylist3=new ArrayList<Employee>();
		
		// adding values to Arraylist
		
		mylist.add(100);
		mylist.add(100);
		mylist.add("WELCOME");
		mylist.add('A');
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		
		// to get the array length
		
		System.out.println(mylist.size());
		
		// to print arraylist
		
		System.out.println(mylist);
		//removing
		mylist.remove(1);
		
		System.out.println(mylist);
		//insert elements
		mylist.add(0, 'A');
		
		System.out.println(mylist);
		
		// modify particular element in array ;ist
		
		mylist.set(2, "Sathish");
		System.out.println(mylist);
		
		//to access specific element from arraylist
		
		System.out.println(mylist.get(2));
		
		//reading all the data from arraulist
		
		for(int i=0;i<mylist.size();i++) {
			
			
			System.out.println(mylist.get(i));
		}
		
		//using enhanced for loop
		
		for(Object e:mylist)
		{
			System.out.println(e);
		}
		
		// using iterator specific to collections
		
		Iterator <Object>tt=mylist.iterator();
		
		while(tt.hasNext())
		{
			System.out.println(tt.next());
		}
		
		// to check array is empty or not
		
		System.out.println(mylist.isEmpty());
		
		//remove all objects from array list
		
		//mylist.removeAll(mylist);
		//or
		//mylist.clear();
		
		// removing multiple objects from array list
		
		ArrayList mylist2=new ArrayList();
		mylist2.add("Sathish");
		mylist2.add(null);
		
		System.out.println(mylist);
		mylist.removeAll(mylist2);
		
		System.out.println(mylist);
		
		ArrayList <String>mylist4=new ArrayList<String>();
		
		//mylist4.add('A');
		
		
	}

}
