package WrapperClasses;

class BytePractice {
	
	public void byteOperations() {
		Byte b1 = new Byte("12");
		System.out.println(b1);
		
		Byte b2 = new Byte((byte) 12);
		System.out.println(b2);
		
		// Byte b2 = new Byte("name"); --> String also need to be in primitive --> 
		// java.lang.NumberFormatException
		// System.out.println(b2);
		 
		// Byte b2 = new Byte(12);  -->CE
		
		Byte b4 = 12;
		// Byte b5 = "12"; --> CE
		Byte b6 = Byte.valueOf("12");
		// Byte b7 = Byte.valueOf("eight"); //java.lang.NumberFormatException
		
		
		
	}
	
}

class ShortPractice {
	
	
	public void shortOperations() {
		
		Short s1 = new Short((short) 10);
		System.out.println(s1);
		
		Short s2 = new Short("10");
		System.out.println(s2);
		
		// Short s3 = new Short("rrr"); // java.lang.NumberFormatException
		// System.out.println(s3);
		
		Short s4 = 12;
		// Short s5 =(short) "12"; -->CE 
		
		Short s6 = Short.valueOf("12");
		// Short s7 = Short.valueOf("ten"); // --> RUntime error // java.lang.NumberFormatException
	 /// this above 3 codes can be applicable to Integer also Byte Also
		
		
	}
	
	
}

class IntegerPractice {
	
	public void integerOperations() {
	       Integer i = new Integer(10);
	       System.out.println(i);
	       
	       Integer i2 = new Integer("10");
	       System.out.println(i2);
	       
	       
	      //  Integer i3 = new Integer("twenty"); // java.lang.NumberFormatException
	      //  System.out.println(i3);
	       
	       Integer i4 = 10;
	      //  Integer i5 = "10"; --> CompileTime Error
	}
	
	
	
	
}

class LongPractice {
	
	public void longOperations() {
		
		Long l1 = new Long(12);
		System.out.println(l1);
		
		Long l2 = new Long("13");
		System.out.println(l2);
		
		Long l3 = new Long(1222l); // --> it is fine
		System.out.println(l3);
		
		// Long l4 = new Long("13333l");//java.lang.NumberFormatException
		//  System.out.println(l4);
		
		// Long l5 = new Long("thirteen"); // java.lang.NumberFormatException
		// System.out.println(l5);
		
		Long l6 = 22222L;
		Long l7 = 22222l;
		Long l8 =(long) 22222; // this three line are applicable to float also double also
		
		
		
	}
	
	
	
	
}

class FloatPractice {
	
	public void floatOpearations() {
	
	    Float f1 = new Float(12.34);
        System.out.println(f1);
       
	
	    Float f2 = new Float("12.34");
	    System.out.println(f2);

	    Float f3 = new Float(3.14f);
	    System.out.println(f3);

	    Float f4 = new Float("3.14F");
	    System.out.println(+f4);
	    
	    // Float f5 = new Float("float"); // java.lang.NumberFormatException
	   //  System.out.println(f5);
	    
	    Float f6 = 3.12f; // or 3.12F same for double 
	    System.out.println(f6);
	}
	
}

class DoublePractice {
	


	public void doubleOperations() {
		Double d1 = new Double(234.43);
		System.out.println(d1);
		
		Double d2 = new Double("222.222");
		System.out.println(d2);
		
		// Double d3 = new Double("err");// java.lang.NumberFormatException
		// System.out.println(d3);
		
		Double d4 = 234.34d;
		System.out.println("d4 is : " + d4);
	}
	
	
}


/** Very important **/
class CharacterPractice {
	
	public void characterOperations() {
		
		Character c1 = new Character((char) 65);
		System.out.println(c1);
		
		Character c2 = new Character('a');
		System.out.println(c2);
		
		Character c3 = 'b';
		System.out.println("c3 is " + c3);
		Character c4 = (char) 89;
		System.out.println("c4 is " +c4);
	}
	
	
}

/** Very important **/
class BooleanPractice {
	
	public void booleanOperations() {
		
		 Boolean b1 = new Boolean(true);
		 System.out.println(b1);
		 
		 Boolean b2 = new Boolean(false);
		 System.out.println(b2);
		 
	    // Boolean b3 = new Boolean(True); CE
		//  Boolean b4 = new Boolean(False); CE
		 
		 Boolean b5 = new Boolean("true");
		 System.out.println(b5);
		 
		 Boolean b6 = new Boolean("false");
		 System.out.println(b6);
		 
		 Boolean b7 = new Boolean("True");
		 System.out.println(b7);
		 
		 Boolean b8 = new Boolean("False");
		 System.out.println(b8);
		 
		 Boolean b9 = new Boolean("tRuE");
		 System.out.println(b9);
		 
		 Boolean b10 = new Boolean("FaLSe");
		 System.out.println(b10);
		 
		 Boolean b11 = new Boolean("Yes");
		 System.out.println(b11);
		 
		 Boolean b12 = new Boolean("No");
		 System.out.println(b12);
		 
		 Boolean b13 = new Boolean("something");
		 System.out.println(b13);
		 
		 Boolean b14 = new Boolean("true" + " ");
		 System.out.println(b14);
		 
		 Boolean b15 =  true;
		 System.out.println("it is b15: " +b15);
		 
		 
		 
		 
		 
		 
		 
	}
	
	
}




public class Wrapper1 {

	public static void main(String[] args) {
	
        BytePractice b = new BytePractice();
        b.byteOperations();
        
        ShortPractice s = new ShortPractice();
        s.shortOperations();
        
        IntegerPractice i = new IntegerPractice();
        i.integerOperations();
        
        LongPractice l = new LongPractice();
        l.longOperations();
        
        FloatPractice f = new FloatPractice();
        f.floatOpearations();
        
        DoublePractice d = new DoublePractice();
        d.doubleOperations();
        
        CharacterPractice c = new CharacterPractice();
        c.characterOperations();
        
        BooleanPractice bool = new BooleanPractice();
        bool.booleanOperations();
}
}
