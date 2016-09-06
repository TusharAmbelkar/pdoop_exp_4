package Exp4;

import java.util.Scanner;

public abstract class MobilePhone implements Callable,Chargeable{

	public void call(){
		System.out.println("Dial a number:");
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		System.out.println("Calling "+a+".......");
		System.out.println("Do you want to end the call...Press 0 if yes else 1");
		a=s.nextInt();
		call_end(a);
	}
	public void call_end(long a){
		if(a==0)
			System.out.println("....Ending call"+".....Call Ended.");
		else
			System.out.println("....Waiting for call to get over.\n......Call Ended.");
	}

}
