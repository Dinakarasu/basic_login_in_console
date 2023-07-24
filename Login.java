package demo_projects;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String uname="dina";
		String psw="12345";
		Scanner user= new Scanner(System.in);
		System.out.print("Enter the username:");
		String input=user.nextLine();
		System.out.print("Enter the password:");
		String inpsw=user.nextLine();
		if(uname.equals(input)) {
		if(psw.equals(inpsw)) {
			System.out.println("welcome user");
		}
		else {
			System.out.println("wrong password pls check");
		}
	}
		else {
			System.out.println("wrong username pls check");
		}
	}

}
