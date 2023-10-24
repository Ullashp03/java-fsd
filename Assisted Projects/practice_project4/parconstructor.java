package practice_project4;

public class parconstructor {
	int id;
	String name;

	void Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
	
	public parconstructor(int i, String string) {
		// TODO Auto-generated constructor stub
		}



public static void main(String[] args) {

	parconstructor std1=new parconstructor(2,"Alex");
	parconstructor std2=new parconstructor(10,"Annie");
	std1.display();
	std2.display();
		}
}



