package Collection3;

public class LaunchGarbageCollectorAction {

	public static void main(String[] args) throws InterruptedException{
		Employee e=new Employee();
		
		
		

		e = null;
		
		System.gc();
		Thread.sleep(2000);
		System.out.println("done ");
		
		
		

	}

}

class Employee
{
	@Override
	public void finalize()
	{
		System.out.println("cleaning the object");
	}
}
