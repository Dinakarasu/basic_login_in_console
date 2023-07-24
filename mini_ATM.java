package demo_projects;
import java.util.Scanner;
public class mini_ATM {

	public static void main(String[] args) {
		int pin=1234;
		int balance=5000;
		
		int addamount=0;
		int takeamount=0;
		
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin number:");
		int password=sc.nextInt();
		if(password==pin) {
			System.out.println("Enter the name:");
		    name=sc.next();
	    	System.out.println("-------------------------------------------------------------------------------------------------------");
		    System.out.println("Welcome "+name+"\n");
		    while(true) {
		    	System.out.println("Press 1 to check your balance");
		    	System.out.println("Press 2 to Add amount");
		    	System.out.println("Press 3 to Take amount");
		    	System.out.println("Press 4 to take recipt");
		    	System.out.println("Press 5 to Exit");
		    	
		    	System.out.println("-------------------------------------------------------------------------------------------------------");
		    
		    int opt = sc.nextInt();
		    switch(opt) {
		    case 1:
		    	System.out.println("your are current balance: "+balance +"\n");
		    	break;
		    case 2:
		    	System.out.println("How much amount did you want to Add to your account: ");
		    	addamount=sc.nextInt();
		    	System.out.println("Successfully credited"+"\n");
		    	balance=addamount+balance;
		    	break;
		    case 3:
		    	System.out.println("how much amount did you want to take:" );
		    	takeamount=sc.nextInt();
		    	if(takeamount>balance) {
		    		System.out.println("your balance is insufficient");
		    		System.out.println("try less than your available balance"+"\n");
		    	}
		    	else {
		    		System.out.println("successfully taken"+"\n");
		    		balance = balance - takeamount;
		    	}
		    	break;
		    case 4:
		    	System.out.println("Welcome to our mini Atm");
		    	System.out.println("Available balance : "+balance);
		    	System.out.println("Amount deposited  : "+addamount);
		    	System.out.println("Amount taken      : "+takeamount);
		    	System.out.println("Thanks for coming"+"\n");
		    	break;
		     default:
		    	System.out.println("press the number below 5"+"\n");
		    	break;
		    }
		    if(opt==5) {
		    	System.out.println("Thank you!!!"+"\n");
		    	break;
		    }
		    }
		    }else{
		    	System.out.println("wrong password"+"\n");
		}
	}

}
