package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
	
		ArrayList a1=new ArrayList();
		
		//List l1=new ArrayList();
		
		a1.add(100);
		a1.add("HI");
		a1.add(null);
		a1.add(100);
		a1.add('A');
		a1.add(null);		
		System.out.println(a1);
		
		a1.remove(1);
		
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		a1.set(2, "Welcome");
		
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		
		ArrayList <Integer>a2=new ArrayList<Integer>();
		
		//a2.add('A');
		
		a1.add(2, "Sathish");
		
		System.out.println(a1);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		for(Object e:a1)
		{
			System.out.println(e);
		}
		
		Iterator <Integer>it=a2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//a1.clear();
		
		ArrayList a3=new ArrayList();
		
		a3.add("Sathish");
		a3.add(null);
		
		
		a1.removeAll(a3);
		System.out.println(a1);
		
		System.out.println(a1.isEmpty());
	}
	

}
