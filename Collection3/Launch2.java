package Collection3;

import java.util.*;

public class Launch2 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(7, "Cristiano Ronaldo");
		hm.put(10, "Lionel Messi");
		hm.put(11, "Mohammed Salah");
		hm.put(116, "Haroon");
		hm.put(124, "Sri Haran");
		hm.put(217, "Mugesh Raja");
		
	     Set keyData=hm.keySet();
	     System.out.println(keyData);
	     
	     Iterator k= keyData.iterator();
	     while(k.hasNext())
	     {
	    	 System.out.println("Object key: " + k.next());
	     }
	     
	      Collection valueData= hm.values();
	      System.out.println(valueData);
	      
	       Iterator i= valueData.iterator();
	       while(i.hasNext())
	       {
	    	   System.out.println("Object Value : " + i.next());
	       }
	      
	      Set data=hm.entrySet();
	      System.out.println(data);
	      
	       Iterator itr= data.iterator();
	       
	       while(itr.hasNext())
	       {
	    	    Map.Entry mapData =(Map.Entry) itr.next();
	    	    System.out.println(mapData.getKey() + " : " + mapData.getValue() );
	       }

	}

}
