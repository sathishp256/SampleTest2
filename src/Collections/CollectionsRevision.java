package Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsRevision {

	public static void main(String[] args) {
		
		// Collections
		
		//declaration of array list
		
		//ArrayList a1=new ArrayList();
		
		/*List l1=new ArrayList();
		
		//List<Integer> s1=new <Integer>ArrayList();
		
		
		
		l1.add(123);
		l1.add("sss");
		l1.add(123);
		l1.add(123);
		l1.add("sss");
		l1.add("sss");
		l1.add('a');
		l1.add(null);
		l1.add(null);
		l1.add(null);
		
		
		System.out.println(l1.size());
		
		System.out.println(l1);
		
		l1.remove(1);
		
		System.out.println(l1);
		
		l1.add(1,"sss");
		System.out.println(l1);
		
		l1.set(1, "rrr");
		
		System.out.println(l1);
		
		System.out.println(l1.get(1));
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		for(Object ab:l1) {
			
			System.out.println(ab);
			
		}
		
		Iterator i1=l1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		//l1.clear();
		//l1.removeAll(l1);
		
		ArrayList al=new ArrayList();
		
		al.add('a');
		
		l1.removeAll(al);
		
		System.out.println(l1);*/
		
		// Hash set
		
		/*HashSet s1=new HashSet();
		
		Set s2=new HashSet();
		
		Set<Integer> s3=new <Integer>HashSet();
		
		s1.add(100);
		
		s1.add("rrr");
		
		s1.add('a');
		
		s1.add(100);
		
		s1.add("rrr");
		
		System.out.println(s1.size());
		
		System.out.println(s1);
		
		//s1.remove('a');
		System.out.println(s1);
		
		ArrayList a1=new ArrayList(s1);
		System.out.println(a1.get(1));
		
		for(Object ss:s1) {
			System.out.println(ss);
		}
		
		Iterator i1=s1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		s1.clear();
		
		System.out.println(s1);*/
		
		//Hashmap
		
		//Map interface -> imple -> HashMap class
		
		HashMap h1=new HashMap();
		
		Map m1=new HashMap();
		
		Map<Integer,String> m2=new <Integer,String>HashMap();
		
		h1.put(101, "AAA");
		h1.put(102, "ggg");
		h1.put(103, "OIS");
		h1.put(101, ""
				+ "");
		
		System.out.println(h1.size());
		
		System.out.println(h1);
		
		System.out.println(h1.get(102));
		
		System.out.println(h1.keySet());
		
		System.out.println(h1.values());
		
		System.out.println(h1.entrySet());
		
		//h1.remove(101);
		
		System.out.println(h1);
		
		for(Object k:h1.keySet()) {
			System.out.println(h1.get(k));
		}
		
		
		
		
		
		
		
		

	}

}
