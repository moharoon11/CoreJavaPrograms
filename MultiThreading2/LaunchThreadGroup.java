package MultiThreading2;

class Heros implements Runnable
{
	
	public void run() {
		
	}
}

public class LaunchThreadGroup {

	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("Captain America");
		
		Thread blackWidow = new Thread(tg, new Heros(), "Natasha");
		Thread winterSoldier = new Thread(tg, new Heros(), "Buggy");
		Thread Hulk = new Thread(tg, new Heros(), "Bruce Banner");
		
	 
		
		
	

	}

}
