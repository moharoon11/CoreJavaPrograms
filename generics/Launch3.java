package generics;
import java.util.ArrayList;
class Account<T>{
     
	ArrayList<T> accounts=new ArrayList<T>();
	
	public void add(T obj) 
	{
		accounts.add(obj);
	}
	
	public T get(int index) 
	{
		return accounts.get(index);
	}
	
}
public class Launch3 {

	public static void main(String[] args) {
		Account<String> acc1=new Account<String>();
		acc1.add("Haroon");
		acc1.add("11634564");
		acc1.add("4321");
		
		String aName = acc1.get(0);
		String aNo = acc1.get(1);
		String pwd = acc1.get(2);
		
		System.out.println("Account Name: " + aName);
		System.out.println("Account Number: " + aNo);
		System.out.println("Account password: " + pwd);
		
		
        
		
	}
}
