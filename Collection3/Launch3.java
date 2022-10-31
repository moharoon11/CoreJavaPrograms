package Collection3;
import java.util.*;

public class Launch3 {

	public static void main(String[] args) {
		
		Map RM=new HashMap();
		RM.put(9, "Benzema");
		RM.put(21, "Rodrygo");
		RM.put(11, "Vinicious");
		RM.put(12 , "Bale");
		RM.put(10 , "Modric");
		
		 Set EC= RM.entrySet();
		 
		 Iterator players= EC.iterator();
		 
		 while(players.hasNext())
		 {
			  Map.Entry entrySet= (Map.Entry) players.next();
			  
			  if(entrySet.getKey().equals(9) || entrySet.getKey().equals(10))
			  {
				  System.out.println("Ballondo'r Winner is : " + entrySet.getValue());
			      if(entrySet.getKey().equals(9))
			      {
			    	  entrySet.setValue("Kareem Benezema");
			      }else {
			    	  entrySet.setValue("Luka Modric");
			      }
			  }else if(entrySet.getKey().equals(12) || entrySet.getKey().equals(11)) {
				  System.out.println("This the fastest sprinters of Real Madrid : " +
			  entrySet.getValue());
				  if(entrySet.getKey().equals(12))
				  {
					  entrySet.setValue("Gerath Bale form wales");
				  }else {
					  entrySet.setValue("Vinicious Jr the Fastest Kid");
				  }
				  
			  }else if(entrySet.getKey().equals(21))
			  {
				  System.out.println("A good Dribbler and playmaker: " + entrySet.getValue());
			      entrySet.setValue("Rodrygo a future star of Reak Madrid");
			  }
		 }
		
		 System.out.println(EC);
		 System.out.println(RM);

	}

}
