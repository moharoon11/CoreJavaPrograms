package WrapperClasses2;

class ValueMethod {
	
	public void example1() {
		
		// Value() method used to convert wrapper to primitive
		Byte b = new Byte((byte) 2);
		byte b1 = b.byteValue();
		
		Short s = new Short((short) 4);
		short s1 = s.shortValue();
		
		Integer i = new Integer(8);
		int i1 = i.intValue();
		
		Long l = new Long(16);
		long l1 = l.longValue();
		
		Float f = new Float(4.3);
		float f1 = f.floatValue();
		
		Double d = new Double(8.78);
		double d1 = d.doubleValue();
		
		Character c = new Character('a');
		char c1 = c.charValue();
		
		Character c2 = new Character((char) 65);
		char c3 = c2.charValue();
		
		Boolean bool = new Boolean("True");
		boolean bool1 = bool.booleanValue();
		
		Boolean bool2 = new Boolean("False");
		boolean bool3 = bool2.booleanValue();
		
		Boolean bool4 = new Boolean("tRuE");
		boolean bool5 = bool4.booleanValue();
		
		Boolean bool6 = new Boolean("FAlsE");
		boolean bool7 = bool6.booleanValue();
		
		Boolean bool8 = new Boolean("Words");
		boolean bool9 = bool6.booleanValue();
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
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
		
		
	}
	
      public void example2() {
		
		// Value() method used to convert wrapper to primitive
		Byte b = Byte.valueOf((byte) 2);
		byte b1 = b.byteValue();
		
		Short s = Short.valueOf((short) 4);
		short s1 = s.shortValue();
		
		Integer i = Integer.valueOf(8);
		int i1 = i.intValue();
		
		Long l = Long.valueOf(16);
		long l1 = l.longValue();
		
		Float f = Float.valueOf(4.3f);
		float f1 = f.floatValue();
		
		Double d = Double.valueOf(8.3);
		double d1 = d.doubleValue();
		
		Character c = Character.valueOf('a');
		char c1 = c.charValue();
		
		Character c2 = Character.valueOf((char) 65);
		char c3 = c2.charValue();
		
		Boolean bool = Boolean.valueOf("True");
		boolean bool1 = bool.booleanValue();
		
		Boolean bool2 = Boolean.valueOf("False");
		boolean bool3 = bool2.booleanValue();
		
		Boolean bool4 = Boolean.valueOf("tRuE");
		boolean bool5 = bool4.booleanValue();
		
		Boolean bool6 = Boolean.valueOf("FAlsE");
		boolean bool7 = bool6.booleanValue();
		
		Boolean bool8 = Boolean.valueOf("Words");
		boolean bool9 = bool6.booleanValue();
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
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
		
		
	}
	
	
}
public class LaunchWrapper2 {

	public static void main(String[] args) {
		ValueMethod valueMethod = new ValueMethod();
		valueMethod.example1();
		
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");
		
		valueMethod.example2();

	}

}
