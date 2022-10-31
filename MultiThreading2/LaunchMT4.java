package MultiThreading2;

class Warrior implements Runnable
{
	String res1 = "Laser Beem";
	String res2 = "Lighting Speed";
	String res3 = "Hulk Smash";
	
	public void run() {
		
		String tName = Thread.currentThread().getName();
		
		
		
		if(tName.equals("Thanos"))
		{
			
			thanosAquiredResources();
		}
		else
		{
			strangeAquiredResources();
		}
	}
	
	public void thanosAquiredResources() 
	{
		
		try 
		{
			Thread.sleep(3000);
			synchronized(res1)
			{
				System.out.println(res1 + " is given to thanos");
				Thread.sleep(3000);
				synchronized(res2)
				{
					System.out.println(res2 + " is given to thanos");
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println(res3 + " is given to thanos");
					}
				}
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void strangeAquiredResources() 
	{
		

		try 
		{
			Thread.sleep(3000);
			synchronized(res1)
			{
				System.out.println(res1 + " is given to Dr.Stephen Strange");
				Thread.sleep(3000);
				synchronized(res2)
				{
					System.out.println(res2 + " is given to Dr.Stephen Strange");
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println(res3 + " is given to Dr.Stephen Strange");
					}
				}
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
public class LaunchMT4 {

	public static void main(String[] args) {
		
		Warrior warrior = new Warrior();
		
		
		Thread thread1 = new Thread(warrior);
		Thread thread2 = new Thread(warrior);
		
		
		thread1.setName("Thanos");
		thread2.setName("Dr.Strange");
		
		thread1.start();
		thread2.start();

	}

}
