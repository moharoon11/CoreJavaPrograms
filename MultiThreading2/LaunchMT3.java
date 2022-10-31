package MultiThreading2;

class Friend implements Runnable
{

	
	
	public void run() {
		 String name = Thread.currentThread().getName();
		 
		 talking(name);
	}
	
	synchronized public void talking(String name) {
        System.out.println(name + " is talking to his teacher in phone");
		
		System.out.print("Still talking");
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(".");
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println(name + " is finished talking his teacher");
	}
	
}
public class LaunchMT3 {

	public static void main(String[] args) {
		
		Friend friend = new Friend();
		
		Thread t1 = new Thread(friend);
		Thread t2 = new Thread(friend);
		Thread t3 = new Thread(friend);
		
		t1.setName("Hassan");
		t2.setName("Umar");
		t3.setName("Haroon");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
