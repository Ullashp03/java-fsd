package assisted_project8;

public class Encapsulation_main 
{     
	public static void main (String[] args)  
	{ 
		encapsulation obj = new encapsulation(); 
		obj.setName("Ullas"); 
		obj.setAge(23); 
		obj.setRoll(100); 
		System.out.println("My name: " + obj.getName()); 
		System.out.println("My age: " + obj.getAge()); 
		System.out.println("My roll: " + obj.getRoll());      
	} 
}



