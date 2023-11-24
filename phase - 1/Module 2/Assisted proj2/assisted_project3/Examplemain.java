package asst_proj;

class Examplemain 
{ 
	public static void main(String args[]) 
	{ 
		Example snd = new Example(); 
		ThreadedSend S1 = 
				new ThreadedSend( " hello " , snd ); 
		ThreadedSend S2 = 
				new ThreadedSend( " Bye " , snd ); 
		S1.start(); 
		S2.start(); 
		try
		{ 
			S1.join(); 
			S2.join(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println("Interrupted"); 
		} 
	} 
}
