package Collection3;

import java.util.*;
public class Launch4 {

	public static void main(String[] args) throws InterruptedException {
		HashMap h=new HashMap();
		Temp t=new Temp();
		
		h.put(t, "haroon");
		System.out.println(h);
		
		t = null;
		System.gc();
		Thread.sleep(2000);
		
		System.out.println(h);
		
		
		WeakHashMap w=new WeakHashMap();
		Temp t2 = new Temp();
		w.put(t2, "Mohammed Haroon");
		System.out.println(w);
		
		t2 = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(w);
		
		LinkedHashMap l=new LinkedHashMap();
		Temp t3=new Temp();
		
		l.put(t3, "I am Linked Hash Map");
		
		
		System.out.println(l);
		
		t3 = null;
		
		System.gc();
		Thread.sleep(2000);
		System.out.println(l);
		
		

	}

}

class Temp
{
	
	@Override 
	public String toString()
	{
		return "temp";
	}
}
