package Interface;

public interface Humans {

	void talk();
	void sleep();
	
}



class Arithmetic {
	
	public void sum() {
		System.out.println("sum in arithmetic");
	}
	
	public void sub() {
		System.out.println("sub in arithmetic");
	}
	
}


class Kids extends Arithmetic implements Humans {
	
	// inherited method is sum
	
	// overrided sum method of Arithmetic
	
	public void sum() {
		System.out.println("sum method in Kids");
	}
	
	// Implementation methods of Humans interface
	public void talk() {
		System.out.println("talk method implemented in Kids");
	}
	
	public void sleep() {
		System.out.println("sleep method implemented in Kids");
	}
	
	public void cute() {
		System.out.println("cute method in Kids");
	}
	
}

class Assistance {
	
	public void permitInterface(Humans humans) {
		humans.talk();
		humans.sleep();
		((Kids)humans).cute();
		
	}
	
	public void permitClass(Arithmetic arithmetic) {
		arithmetic.sum();
		arithmetic.sub();
	}
}

class Launch2 {
	
	public static void main(String[] args) {
		Humans h = new Kids(); // upcasting is possible in interface
		
		 // h.talk();
		 // h.sleep();
		// ((Kids)h).cute(); // down casting is possible in interface
		 
		// Kids kids =(Kids) h; --> it is possible 
		
		
		// h.sum();
		// h.sub();
		/**
		Kids k = new Kids();
		k.talk();
		k.sleep();
		k.sum();
		k.sub();
		k.cute();
		**/
		Arithmetic arith = new Kids();
		
		Assistance assistance = new Assistance();
		assistance.permitInterface(h);
		assistance.permitClass(arith);
		
		
		
	}
}
