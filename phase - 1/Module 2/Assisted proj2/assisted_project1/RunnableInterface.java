package assisted_project1;

public class RunnableInterface implements Runnable{


	public static int myCount = 0;
	public RunnableInterface(){

	}
	public void run() {
		while(RunnableInterface.myCount <= 10){
			try{
				System.out.println("Expl Thread: "+(++RunnableInterface.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: "+iex.getMessage());
			}
		}
	} 
	public static void main(String a[]){
		System.out.println("Starting Main Thread...");
		RunnableInterface mrt = new RunnableInterface();
		Thread t = new Thread(mrt);
		t.start();
		while(RunnableInterface.myCount <= 10){
			try{
				System.out.println("Main Thread: "+(++RunnableInterface.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex){
				System.out.println("Exception in main thread: "+iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}



