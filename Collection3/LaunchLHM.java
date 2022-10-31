package Collection3;

import java.util.*;

public class LaunchLHM {

	public static void main(String[] args) {
		LinkedHashMap lh = new LinkedHashMap();
		
		lh.put("1","one");
		lh.put("2", "two");
		lh.put("3", "three");
		
		System.out.println(lh);
		
		 Set set = lh.entrySet();
		  Iterator itr= set.iterator();
		  while(itr.hasNext())
		  {
			  Map.Entry data=(Map.Entry) itr.next();
			  System.out.println(data.getKey() + " : " + data.getValue());
		  }
		  
		  
		  HashMap hm=new HashMap();
		  
		  Integer i1=new Integer(10);
		  Integer i2=new Integer(10);
		  
		  hm.put(i1, "1000");
		  hm.put(i2, "2000");
		  
		  System.out.println(hm);

	}

}
