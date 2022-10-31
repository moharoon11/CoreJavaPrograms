package MultiThreading2;

class Players implements Runnable
{
	
	public void run() {
		String name = Thread.currentThread().getName();
		
		
		
		synchronized(this) {
			System.out.println(name + " is sented the request to anther player");
		for(int i=1; i<=3; i++) {
			
			System.out.println(name + " Sending the request.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Request accepted.");
	}
	

		 
	    System.out.println(name + " playing the game......");
	    
	    
	 
	    
	  
	    
	   
	    System.out.println(name + " finished playing");
	    
	    System.out.println(name + " saving the state");
	   
	    System.out.println(name + " exited the game");
	    
	}

	
}
public class LaunchMT2 {

	public static void main(String[] args) {
	  Players player = new Players();
	  
	  Thread t1 = new Thread(player);
	  Thread t2 = new Thread(player);
	  Thread t3 = new Thread(player);
	  
	  t1.setName("Player1");
	  t2.setName("Player2");
	  t3.setName("Player3");
	  
	  t1.start();
	  t2.start();
	  t3.start();
	  
	  

	}

}
