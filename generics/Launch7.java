package generics;

import java.util.*;
class Work<T>{
	
	T obj;
	public void write(ArrayList<? extends Number> al) {
		
	}
	
	public void read(ArrayList<? extends LinkedHashSet> al) {
		
	}
	
	public void create(LinkedList<? super Runnable> ll) {
		
	}
	
	public <T extends Number> void m1() {
		  
	}
	
//	public <T extends Number&String> void m2() {
//		  
//	}
	public <T extends Number&Set> void m3() {
		  
	}
	public <T extends Number&SortedSet&Deque> void m4() {
		  
	}
	public <T extends List&Queue> void m5() {
		  
	}
//	public <T extends Set&HashSet> void m6() {
//		  
//	}
	
}
public class Launch7 {

	public static void main(String[] args) {
//		Work w=new Work();
//		ArrayList<String> al=new ArrayList<String>();
//		w.write(null);
//		
//		ArrayList<? extends Number> l6=new ArrayList<Integer>();
//         l6.add(45, null);
		
// ArrayList<?> alll=new ArrayList<?>(); 
		
		ArrayList list=new ArrayList();
		list.add(65);
		list.add(45);
		list.add(90);
		list.add(23);
		System.out.println(list);
		System.out.println(list.get(0));
	     Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(0));
         
	}

}
