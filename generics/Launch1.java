package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
public class Launch1 {

	public static void main(String[] args) {
		
		// Type Safety and Type casting problem is resolved through generics
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hyder Abbas -> Java Developer");
		al.add("Nithin Manjunath -> Java Developer");
		al.add("Naveen Reddy -> Java Developer");
		
		String mentor1 = al.get(0);
		String mentor2 = al.get(1);
		String mentor3 = al.get(2);
		
		System.out.println(mentor1 + ":" + mentor2 + ":" + mentor3);
		
		
		/**
		 * 1. Polymorphism concept is applicable only for the base type 
		 * but not for parameter type
		 */
		
		List<Integer> l1=new LinkedList<Integer>();
		// Queue<Object> l2=new PriorityQueue<String>(); --> CE:Incompatible types
		
		
		/**
		 * Collections concept applicable only for objects , Hence 
		 * for the parameter type we can use any class or interface name 
		 * but not primitive 
		 * 
		 * EG: Set<int> s=new TreeSet<int>(); // CE: found:primitive
		 *                                       required: reference
		 */
		
		
		
		

	}

}
