package practice_project1;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] num1rgs) {
		int num1,num2,result,option;
		while(true) {
			System.out.println("Input 2 Integer");

			Scanner inputobj=new Scanner(System.in);

			num1=inputobj.nextInt();
			num2=inputobj.nextInt();
			System.out.println();

			System.out.println("Options");
			System.out.println();
			System.out.println("1. Sum");
			System.out.println("2. Diff");
			System.out.println("3. Product");
			System.out.println("4. Division");

			option=inputobj.nextInt();

			if(option==1) {
				result=num1+num2;
				System.out.println("sum of the number is "+result);
				System.out.println();
			}
			else if(option==2) {
				result=num1-num2;
				System.out.println("diff of the number is"+result);
				System.out.println();
			}
			else if(option==3) {
				result=num1*num2;
				System.out.println("product of the number is "+result);
				System.out.println();
			}
			else if(option==4) {
				result=num1/num2;
				System.out.println("result of the divided num is  "+result);
				System.out.println();
			}
			else {
				System.out.println("Invalid entry");
				System.out.println();
			}
		}
	}
}


