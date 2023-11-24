package asst_proj;

class Example 
{ 
	public void send(String msg) 
	{ 
		System.out.println("Sending\t"  + msg ); 
		try
		{ 
			Thread.sleep(1000); 
		} 
		catch (Exception e) 
		{ 
			System.out.println("Thread  interrupted."); 
		} 
		System.out.println("\n" + msg + "Sent"); 
	} 
} 
class ThreadedSend extends Thread 
{ 
	private String msg; 
	private Thread t; 
	Example  sender; 
	ThreadedSend(String m,  Example obj) 
	{ 
		msg = m; 
		sender = obj; 
	} 

	public void run() 
	{  
		synchronized(sender) 
		{ 
			sender.send(msg); 
		} 
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	} 
} 



