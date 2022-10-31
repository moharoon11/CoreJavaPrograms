package Collection3;

import java.util.*;
public class Launch1 {

	public static void main(String[] args) {
	  
		HashMap hm=new HashMap();
		hm.put(7, "Cristiano Ronaldo");
		hm.put(10, "Lionel Messi");
		hm.put(11, "Mohammed Salah");
		System.out.println(hm);
		
		HashMap hm1=new HashMap();
		hm1.put(116, "Haroon");
		hm1.put(124, "Sri Haran");
		hm1.put(217, "Mugesh Raja");
		
		hm.putAll(hm1);
		System.out.println(hm);
		
		System.out.println(hm.get(7));
		String ronaldo =(String) hm.get(7);
		System.out.println(ronaldo);
		hm.remove(116);
		System.out.println("After removing 116 from h1");
		System.out.println(hm);
		
		boolean check = hm.containsKey(11);
		System.out.println(check);
		System.out.println(hm.containsKey(12));
		boolean test = hm1.containsValue("Sri Haran");
		System.out.println(test);
		System.out.println(hm1.containsValue("Sri haran"));
		
		System.out.println("CHecking the collection is empty or not");
		boolean h1 = hm.isEmpty();
		System.out.println(h1);
        System.out.println(hm1.isEmpty());
        
        System.out.println("size of hm : " + hm.size() + " Size of hm1: " + hm1.size());
        System.out.println("*****clearing the value of hm collection");
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println("((((((((((((((((((((((((((())))))))))))))))))))))))");
        HashMap play = new HashMap();
        play.put(1,"one");
        play.put(2, "two");
        play.put(3, null);
        play.put(null, "null1");
        play.put(null, null);
        play.put(null, "I am nullvalue");
        System.out.println(play);

	}

}
