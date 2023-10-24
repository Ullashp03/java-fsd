package practice_project3;

public class methods {
	

		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			methods b=new methods();
			int ans= b.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+ans);
			}


}
