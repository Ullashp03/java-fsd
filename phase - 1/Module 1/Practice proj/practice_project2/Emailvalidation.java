package practice_project2;

import java.util.Scanner;

public class Emailvalidation {
	static boolean isValid(String email) {
		String matchingkeywords="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(matchingkeywords);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String email;
		int i;
		for(i=0;i<=3;i++) {
			System.out.println(" Enter Email address ");
			email=s.next();
			
			System.out.println("Email given is: "+email);
			System.out.println();
			System.out.println("Is the entered emailid valid? "+isValid(email));
			System.out.println();
		}
	}
}