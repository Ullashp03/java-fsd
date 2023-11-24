package assisted_project2;

public class Sleepandwait 
{
	private static Object LOCK = new Object();
	public static void main(String args[]) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Thread '" + Thread.currentThread().getName() + "' woke after sleeping for 1 second");
		synchronized (LOCK) 
		{
			LOCK.wait(1000);
			System.out.println("Object '" + LOCK + "' woke after" + " waiting for 1 second");
		}
	}

}