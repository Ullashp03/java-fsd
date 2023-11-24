package practice_project7;

public class Inner_class2 {
	private String msg="Inner Classes";

	void display(){  
		class Inner{  
			void msg(){
				System.out.println(msg);
			}  
		}  

		Inner l=new Inner();  
		l.msg();  
	}  


	public static void main(String[] args) {
		Inner_class2  ob=new Inner_class2 ();  
		ob.display();
	}
}