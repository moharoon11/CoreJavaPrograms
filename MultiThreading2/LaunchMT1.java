package MultiThreading2;

class BathRoom implements Runnable
{
	// If a method is Synchronized only one "Thread" can operate that method at a time.
	synchronized public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + " is entered the bathroom");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " Using the bathroom");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " exited the bathroom");
	
	
	}
	
}
public class LaunchMT1 {

	public static void main(String[] args) {
		BathRoom bt = new BathRoom();
		
		Thread t1 = new Thread(bt);
		Thread t2 = new Thread(bt);
		Thread t3 = new Thread(bt);
		
		t1.setName("Friend1");
		t2.setName("Friend2");
		t3.setName("Friend3");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
