package WrapperClasses2;

public class LaunchWrapper5 {

	public static void main(String[] args) {
		
		Integer a = new Integer(20);
		Integer a1 = new Integer(20);
		System.out.println("a == a1 =" + (a == a1));
		
		Integer b = 30;
		Integer b1 = 30;
		System.out.println("b == b1 :"+ (b == b1));
		
		Integer c = Integer.valueOf(40);
		Integer c1 = Integer.valueOf(40);
		System.out.println("c == c1 : " + (c == c1));
		
		Integer d = new Integer(50);
		Integer d1 = 50;
		System.out.println("d == d1 : " + (d == d1));
		
		Integer e = Integer.valueOf(60);
		Integer e1 = 60;
		System.out.println("e == e1 : " + (e == e1));
		
		Integer f = new Integer(70);
		Integer f1 = Integer.valueOf(70);
		System.out.println("f == f1 : " + (f == f1));
		
		System.out.println("********************************************");
		System.out.println("********************************************");
		
		Integer A = new Integer("80");
		Integer A1 = new Integer("80");
		System.out.println("A == A1 : " + (A == A1));
		
		/**
		 Integer B = "90"; 
		  Autoboxing is not possible for String to wrapper
		  same Autounboxing is not possible for Wrapper to String need to do it manually
		 Integer B1 = "90";
		 System.out.println("B == B1 :"+ (B == B1));
		**/
		;
		Integer C = Integer.valueOf("100");
		Integer C1 = Integer.valueOf("100");
		System.out.println("C == C1 : " + (C == C1));
		
		Integer D = new Integer("111");
		Integer D1 = 111;
		System.out.println("D == D1 : " + (D == D1)); //false
		
		Integer E = Integer.valueOf("60");
		Integer E1 = Integer.valueOf(60); // true
		System.out.println("E == E1 : " + (E == E1));
		
		Integer F = new Integer("70");
		Integer F1 = Integer.valueOf("70");
		System.out.println("F == F1 : " + (F == F1));
		
		Integer G = Integer.valueOf(120);
		Integer G1 = G; // Integer.valueOf(G);
		System.out.println("G == G1 : " + (G == G1));
		
		Integer H = Integer.valueOf("120");
		Integer H1 = H; // Integer.valueOf(H);
		System.out.println("G == G1 : " + (H == H1));
		
		Integer I = Integer.valueOf("121");
		Integer I1 = Integer.valueOf(I);
		System.out.println("I == I1 : " + (I == I1));
		
		Integer J = new Integer("122");
		Integer J1 = new Integer(J);
		System.out.println("J == J1 : " + (J == J1));
		
		Integer K = new Integer("123");
		Integer K1 = 123;
		System.out.println("K == K1 : " + (K == K1));
		
		Integer L = new Integer("124");
		Integer L1 = L; 
	    System.out.println("L == L1 : " + (L == L1));
	    
	   Integer M = Integer.valueOf("1");
	   Integer M1 = M;
	   System.out.println("M == M1 : "  + (M == M1));
	   
	   Integer N = Integer.valueOf(1000);
	   Integer N1 = Integer.valueOf(1000);
	   System.out.println("N == N1 : " + (N == N1));

	   Integer O = Integer.valueOf("1000");
	   Integer O1 = Integer.valueOf("1000");
	   System.out.println("O == O1 : " + (O == O1));
	   
	   Integer P = Integer.valueOf(1000);
	   Integer P1 = P;
	   System.out.println("P == P1 : " + (P == P1));
	   
	   Integer Q = Integer.valueOf("1000");
	   Integer Q1 = Q;
	   System.out.println("Q == Q1 : " + (Q == Q1));
	   
	   Integer R = Integer.valueOf("1000");
	   Integer R1 = 1000;
	   System.out.println("R == R1 : " + (R == R1));
	   
	   Integer S = Integer.valueOf("10", 19);
	   System.out.println(S);
	   
	   
		
		
		
		

	}

}
