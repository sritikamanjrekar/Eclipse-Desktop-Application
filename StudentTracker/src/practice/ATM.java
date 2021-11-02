package practice;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Bank hdfc=new Bank();
		int amt;
		int pin;
		int ch;
		
		do
			{
			System.out.println("welcome \n1 Withdrawl\n2 Deposite\n3 Balance \n4 Change Pin\n5 Exit\nEnter your Choice:\n");
			ch=scn.nextInt();
			switch(ch) {
			
			
		
		case 1:
			System.out.println("Enter amount :");
			amt=scn.nextInt();
			System.out.println("Enter Pin :");
			pin=scn.nextInt();
			hdfc.withdrawl(amt,pin);
			break;
		
		case 2:
			System.out.println("Enter Deposite :");
			amt=scn.nextInt();
			hdfc.deposit(amt);
			break;
		
		case 3:
			System.out.println("Enter Pin :");
			pin=scn.nextInt();
			if(hdfc.getPinCode()==pin) {
				System.out.println("Your balance is "+hdfc.amount);
			}else {
				System.out.println("Try Again");
			}
		
			break;
		
		case 4:
			System.out.println("Enter Acount number :");
			int acc=scn.nextInt();
			if(hdfc.getAcNo()==acc) {
				System.out.println("Enter new pin :");
				pin=scn.nextInt();
				hdfc.setPinCode(pin);
				System.out.println("Pin Change Successfully");
			}
			break;
			
		case 5:
			break;
		
		default :
			System.out.println("Wrong choice");
		}
		
			}while(ch!=5);
		
		System.out.println("Thank you have nice day");
		
		
		
		
		
	}

}
