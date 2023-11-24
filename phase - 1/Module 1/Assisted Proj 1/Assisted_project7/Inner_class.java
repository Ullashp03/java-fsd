package practice_project7;

public class Inner_class {


	private String msg="Welcome to Java"; 

	class Inner{  
		void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	}  


	public static void main(String[] args) {

		Inner_class obj=new Inner_class();
		Inner_class.Inner in=obj.new Inner();  
		in.hello();
	}
}

