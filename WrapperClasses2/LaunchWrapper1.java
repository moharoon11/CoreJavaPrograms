package WrapperClasses2;

class Wrapper1{
	
	public void wrapperOperations() {
		
		// Constructor Usage of Wrapper Class to create Wrapper Object
		// Higher versions of jdk, jdk 8 and above 
		// it is deprecated
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		
		// Usage of Utility methods to create Wrapper Object
		// In real life we always use Utility Methods
		Integer w = Integer.valueOf(10);
		Integer q = Integer.valueOf("10");
		
		System.out.println(i);
		System.out.println(i1);
		
		System.out.println();
		
		System.out.println(w);
		System.out.println(q);
	}
	
	public void example2() {
		Byte b = Byte.valueOf((byte) 10);
		Byte b1 = Byte.valueOf("10");
		
		System.out.println(b);
		System.out.println(b1);
		
		Short s = Short.valueOf((short) 12);
		Short s1 = Short.valueOf("12");
		
		System.out.println(s);
		System.out.println(s1);
		
		Integer i = Integer.valueOf(14);
		Integer i1 = Integer.valueOf("14");
		Integer i2 = Integer.valueOf((int) 14.1);
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		
		Long l  = Long.valueOf(16l);
		Long l1 = Long.valueOf(16L);
		Long l2 = Long.valueOf(16);
		Long l3 = Long.valueOf("16");
		
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		Float f =  Float.valueOf(4.4f);
		Float f1 = Float.valueOf(4.4F);
		Float f2 = Float.valueOf((float) 4.4);
		Float f3 = Float.valueOf("4.4");
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		Double d = Double.valueOf(8.8);
		Double d1 = Double.valueOf(8.8d);
		Double d2 = Double.valueOf(8.8D);
		Double d3 = Double.valueOf("8.8");
		Double d4 = Double.valueOf((float) 8.8);
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		Character c = Character.valueOf('a');
		Character c1 = Character.valueOf((char) 65);
		
		System.out.println(c);
		System.out.println(c1);
		
		Boolean bool = Boolean.valueOf(true);
		Boolean bool1 = Boolean.valueOf(false);
		// Boolean bool2 = Boolean.valueOf(True); --> "CE"
		// Boolean bool3 = Boolean.valueOf(False); --> "CE"
		
		Boolean bool2 = Boolean.valueOf("true");
		Boolean bool3 = Boolean.valueOf("false");
		Boolean bool4 = Boolean.valueOf("TrUE");
		Boolean bool5 = Boolean.valueOf("tRUe");
		Boolean bool6 = Boolean.valueOf("FaLsE");
		Boolean bool7 = Boolean.valueOf("fAlSe");
		Boolean bool8 = Boolean.valueOf("TRUE");
		Boolean bool9 = Boolean.valueOf("FALSE");
		Boolean bool10 = Boolean.valueOf("Harry");
		Boolean bool11 = Boolean.valueOf("Potter");
		
		System.out.println(bool);
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		System.out.println(bool5);
		System.out.println(bool6);
		System.out.println(bool7);
		System.out.println(bool8);
		System.out.println(bool9);
		System.out.println(bool10);
		System.out.println(bool11);
		
	}
}
public class LaunchWrapper1 {

	public static void main(String[] args) {
		
		Wrapper1 wrapper1 = new Wrapper1();
		wrapper1.wrapperOperations();
		wrapper1.example2();

	}

}
