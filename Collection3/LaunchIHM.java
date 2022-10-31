package Collection3;

import java.util.*;
public class LaunchIHM {

	public static void main(String[] args) {
		
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(97, 'a');
		ihm.put(98, 'b');
		ihm.put(99, 'c');
		ihm.put(100, 'd');
		ihm.put(100, 'e');
		
		
		System.out.println(ihm);
		
		 Set s=ihm.entrySet();
		 Iterator itr = s.iterator();
		 
		 while(itr.hasNext())
		 {
			  Map.Entry data =(Map.Entry) itr.next();
			  
	         System.out.println(data.getKey()+":"+data.getValue());
		 }
		
		Integer i1=new Integer(20);
		Integer i2=new Integer(20);
		
		IdentityHashMap h=new IdentityHashMap();
		h.put(i1, "40");
		h.put(i2, "40");
		
		Set s1 = h.entrySet();
		
		Iterator itr1 = s1.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr1.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
		System.out.println(h);
		
	
		
	}

}
