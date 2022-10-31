package MultiThreading2;

class Ineuron extends Thread
{
	
	public void run() {
		try 
		{
			
          for(int i=1; i<=3; i++) {
        	 System.out.println(i + " Message is printed");
          }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class LaunchDaemon {

	public static void main(String[] args) {
		
		boolean b = Thread.currentThread().isDaemon();
		
		Thread t = Thread.currentThread();
		
        System.out.println(t.isDaemon());
        
        // t.setDaemon(false);
        // System.out.println(t.isDaemon());
        
        Thread th = new Thread();
        
        System.out.println(th.isDaemon());
        
        th.setDaemon(true);
        
        System.out.println(th.isDaemon());
        
        Ineuron in = new Ineuron();
        
        in.start();
        in.setDaemon(true);
//        try {
//          in.start();
//        }catch(Exception e) {
//        	System.out.println("hey are you mad");
//        }
       
        
        System.out.println("main thread finished its execution");
	}

}
