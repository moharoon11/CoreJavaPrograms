package generics;

class Gen<T>{
	
	T obj;
	
	Gen(T obj){
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("The type of object is: " + obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}

}


public class Launch2 {

	public static void main(String[] args) {
		Gen<Integer> g1=new Gen<Integer>(20);
		g1.show();
		System.out.println(g1.getObject());
		
		// Gen<String> g2=new Gen<String>(34);--> CE:int is undefined
		
		/**
		Gen<String> g2=new Gen(45);
		g2.show();
		System.out.println(g2.getObject());
		-----> Exception at runtime<---------------
		**/
		
		Gen<String> g2=new Gen<String>("HI");
		g2.show();
		System.out.println(g2.getObject());
		
		Gen<Boolean> g3=new Gen<Boolean>(true);
		g3.show();
		System.out.println(g3.getObject());
		
		
		
		
		
		
		

	}

}
