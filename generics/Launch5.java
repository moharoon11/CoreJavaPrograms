package generics;

import java.util.HashMap;
import java.util.Set;

class Point<PO,PV>{
	
	HashMap<PO,PV> hm=new HashMap<PO,PV>();
	

	public void put(PO object,PV value) {
		hm.put(object,value);
	}
	
	public PV get(PO object) {
		return hm.get(object);
	}
	
	 
	@Override
	public String toString() {
		return extract(); 
	}
	
	
	public  String extract() {
		
		 Set s= hm.entrySet();
		 
		 return "" + s;
	}
	
	
}
public class Launch5 {

	public static void main(String[] args) {
	
		Point<Integer,String> p1=new Point<Integer,String>();
		p1.put(7,"CR7");
		p1.put(10, "LM10");
		p1.put(11, "M.Salah");
		
		System.out.println(p1.get(7));
		System.out.println(p1.get(10));
		System.out.println(p1.get(11));
		
		System.out.println(p1);
		System.out.println();
		Point<String,Integer> p2=new Point<String,Integer>();
		p2.put("haroon", 116);
		p2.put("sriharan", 124);
		System.out.println(p2.get("haroon"));
		System.out.println(p2.get("sriharan"));
		
		System.out.println(p2);
		
		Point p3=new Point();
		p3.put(456, 777);
		p3.put(23.33, "987");
		System.out.println(p3);

	}

}
