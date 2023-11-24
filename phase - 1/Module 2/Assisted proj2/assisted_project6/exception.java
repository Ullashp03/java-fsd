package assisted_project6;

class Exception extends Exception2{
	String str1;
	Exception(String str2) {
		str1=str2;
	}
	public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	}
	class Example1{
		public void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new Exception2("This is My error Message");
			}
			catch(Exception2 exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		}
	}
}

