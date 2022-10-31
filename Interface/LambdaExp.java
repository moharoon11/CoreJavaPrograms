package Interface;
@FunctionalInterface
interface calculations {
	
	int getStringLength(String text);
	
}

class normal implements calculations {
	
	public int getStringLength(String text) {
		return text.length();
	}
}
public class LambdaExp {

	public static void main(String[] args) {
		
		calculations cal = new normal();
	    System.out.println(cal.getStringLength("Nithin Manjunath"));
		
		// anonymous inner class
		calculations calculate = new calculations() {
			
			public int getStringLength(String text) {
				return text.length();
			}
			
		};
		
		System.out.println(calculate.getStringLength("Hyder Abbas"));
	
		
		// Lambda Expression
		// specifying the data of variables in lambda expression is optional
	    calculations calc = (text) -> text.length();
			System.out.println(calc.getStringLength("Naveen Reddy"));
			
		
		
	}
}
