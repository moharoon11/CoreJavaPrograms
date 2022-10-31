package generics;

import java.util.*;

class Check<T extends Number>{
	
}

class Mythread<T extends Thread>{
	
}

class AnotherThread<T extends Runnable>{
	
}

class AnyNumber<Number>{
	
}


public class Launch4 {

	public static void main(String[] args) {
		
		Check<Integer> c1=new Check<Integer>();
		
		// Check<String> c2=new Check<String>(); --> not valid
		// because Check class is bounded type
		
		Mythread<Thread> mt1=new Mythread<Thread>();
		
		//Mythread<String> mt2=new Mythread<String>(); --> not valid
		// because MyThread class is bounded type
		
		AnotherThread<Thread> at1=new AnotherThread<Thread>();
		AnotherThread<Runnable> at2=new AnotherThread<Runnable>();
		// AnotherThread<Integer> at3=new AnotherThread<Integer>();-->not valid
		
		AnyNumber<Long> an1=new AnyNumber<Long>();
	}

}
