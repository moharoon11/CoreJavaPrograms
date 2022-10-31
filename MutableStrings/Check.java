package MutableStrings;

public class Check {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer s = new StringBuffer("Haroon");
		StringBuffer s1 = new StringBuffer("Haroon");
		
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
		
		
		

	}

}
