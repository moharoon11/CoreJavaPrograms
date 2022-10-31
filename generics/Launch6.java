package generics;

import java.util.*;

class Some<T extends Number>{ // valid
	 
}

// class Some1<T extends Number&HashSet>  --> invalid->multiple inheritance not allowed

class Some1<T extends Number&List>{ // valid --> (first coming class then only interface)
	
}

class Some2<T extends HashSet&Deque&List>{ // valid --> multiple inherit on interface allowed
	
}

// class Some3<T extends List&HashSet> --> not valid(first class then interface)

class Some4<T extends Set&List>{ // valid (multiple inherit on interface allowed)
	
}
public class Launch6 {

	public static void main(String[] args) {
		
	

	}

}
