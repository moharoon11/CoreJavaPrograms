package Interface;


interface something {
	
	//marker or tagged interface
}

interface OneMethod {
	 void addition(); 
	 //an interface which contains only one method which is called-->Functional Interface
}
public interface first {

	void sum();
	void sub();
}
interface second extends first {
	
	void div();
	void mod();
	void sum();
}
interface third extends second{  // implements first{
	
	// one interface cannot able to implement another interface but
	// an interface can able to extends one or more interface
	void pow();
}

class practice implements third {
	
	public void sum() {
		System.out.println("sum in practice");
	}

	public void sub() {
		System.out.println("sub in practice");
	}
	
	public void div() {
		System.out.println("div in practice");
	}
	public void mod() {
		System.out.println("mod in practice");
	}
	
	public void pow() {
		System.out.println("pow in practice");
	}
}

class smart {
	
	public void permit(third t) {
		t.sum();
		t.sub();
		t.div();
		t.mod();
		t.pow();
	}
}

class Launch3 {
	public static void main(String[] args) {
		
		practice p = new practice();
		third t = new practice();
		second s = new practice();
		first f = new practice();
		
		
		smart call = new smart();
		call.permit(p);
		System.out.println();
		call.permit(t);
		
		
		/**
		p.sum();
		p.div();
		p.sub();
		p.mod();
		p.pow();
		
		t.sum();
		t.div();
		t.sub();
		t.mod();
		t.pow();
		
		s.sum();
		s.div();
		s.sub();
		s.mod();
		// s.pow();
		
		f.sum();
		f.sub();
		// f.div();
		// f.mod();
		// f.pow();
	**/	

		// call.permit(f);
		// call.permit(s);
	}
}