package practice_project4;

public class defconstructor {
	int id;
	String name;

	void display() {
		System.out.println(id+" "+name);
	}



	public static void main(String[] args) {

		defconstructor emp1=new defconstructor();
		defconstructor emp2=new defconstructor();

		emp1.display();
		emp2.display();
	}
}



