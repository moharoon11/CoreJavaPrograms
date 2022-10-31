package WrapperClasses2;

class ParseIntMethod {
	
	public  static void example1() {
		
		
		
	    byte b = Byte.parseByte("10");
	   //  byte b1 = Byte.parseByte("ten"); // NumberFormatException
	    short s = Short.parseShort("11");
	    int i = Integer.parseInt("12");
	    long l = Long.parseLong("12");
	    float f = Float.parseFloat("13.0");
	    double d = Double.parseDouble("14.0");
	    boolean bool = Boolean.parseBoolean("true");
	    boolean bool1 = Boolean.parseBoolean("false");
	    boolean bool2 = Boolean.parseBoolean("True");
	    boolean bool3 = Boolean.parseBoolean("False");
	    boolean bool4 = Boolean.parseBoolean("TrUe");
	    boolean bool5 = Boolean.parseBoolean("fAlSe");
	    boolean bool6 = Boolean.parseBoolean("kiran");
	    boolean bool7 = Boolean.parseBoolean("rohit");
	    
	    // not char supportive we cannot convert string to char
	    System.out.println(b);
	    // System.out.println(b1);
	    System.out.println(s);
	    System.out.println(i);
	    System.out.println(l);
	    System.out.println(f);
	    System.out.println(d);
	
	}
	
	public static void example2() {
		
		
		Integer i = Integer.valueOf("12"); // String to wrapper
		System.out.println(i);
		System.out.println(i.toString()); // wrapper to String
		
		Integer a = new Integer("22");
		int l = Integer.parseInt(a.toString());
	}
	
	public static void example3() {
		    Byte    b = Byte.parseByte("10");
		    Short   s = Short.parseShort("11");
		    Integer i = Integer.parseInt("12");
		    Long    l = Long.parseLong("12");
		    Float   f = Float.parseFloat("13.0");
		    Double  d = Double.parseDouble("14.0");
		    
		   
	}
	
	public void example4() {
		
		Byte b = 10;
		String s = b.toString();
		
		Short sh = Short.valueOf((short) 23);
		String shs = sh.toString();
		
		Integer i = Integer.valueOf(34);
		Integer si = Integer.valueOf("33");
		String is = i.toString();
		String sis = si.toString();
		
		
		
		Long l = Long.valueOf("789");
		String ls = l.toString();
		
		Float f = Float.valueOf("34.4f");
		String fs = f.toString();
		
		Double d = Double.valueOf("32.3");
		String ds = d.toString();
		
		Boolean bool = Boolean.valueOf("true");
		String bool1 = bool.toString();
		
		Character ch = Character.valueOf('b');
		String sch = ch.toString();
		
		
		
	}
	
  public void example5() {
		
		byte b = 10;
		String s = Byte.toString(b);
		
		short sh = 20;
		String shs = Short.toString(sh);
		
		int i = 34;
		int si = 33;
		String is = Integer.toString(i);
		String sis = Integer.toString(si);
		
		String some = String.valueOf(i);
		
		long l = 234;
		String ls = Long.toString(l);
		
		float f = 34.4f;
		String fs = Float.toString(f);
		
		double d = 45.4;
		String ds = Double.toString(d);
		
		boolean bool = true;
		String bool1 = Boolean.toString(bool);
		
		char ch = 'b';
		String sch = Character.toString(ch);
		
     }
}
public class LaunchWrapper3 {

	public static void main(String[] args) {
		// ParseIntMethod.example1();

	
		

	}

}
