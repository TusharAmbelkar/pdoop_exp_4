package Exp4;

import java.util.Scanner;

public class SamsungGalaxy extends MobilePhone{
private int IMEInumber;
private int PBatteryCharged;
	public SamsungGalaxy() {
		IMEInumber=123456789;
		PBatteryCharged=60;
	}
	public boolean isAvailable(){
		System.out.println("Do you have a Samsung galaxy charger...");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.toUpperCase().charAt(0)=='Y'){
			System.out.println("Insert your charger..");
			return true;
		}
		else
			System.out.println("Sorry....Cannot perform charging operation..");
		return false;
		
	}
	public void charging(){
		System.out.println("Charging started ..."+"Current Status.."+PBatteryCharged+"% charged");
		for(int i=PBatteryCharged;i<=100;i++)
				PBatteryCharged=i;
				System.out.print(PBatteryCharged+"%");
		
		completedCharging();
	}
	public void completedCharging(){
		System.out.println("Charged completely....Remove charger...");
	}
	public void getIMEI(){
		System.out.println("Your IMEI number is:="+IMEInumber);
	}
	public void decreaseC(){
		PBatteryCharged-=5;
	}
	public boolean getcharge(){
		if(PBatteryCharged<=15)
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		int ad;
		boolean ac;
		SamsungGalaxy m=new SamsungGalaxy();
		ac=m.getcharge();
		Scanner s=new Scanner(System.in);
		while(!ac){
		System.out.println("What would you like to do:1>Call\n2>Charge\n3Get IMEI number>\n4>SwitchOff\n");
		ad=s.nextInt();
		switch(ad){
		case 1:
			m.call();
			m.decreaseC();
			break;
		case 2:
			if(m.isAvailable())
				m.charging();
			break;
		case 3:
			m.getIMEI();
			break;
		case 4:
			System.out.println("Switching off....");
			System.out.println("Switched off");
			ac=true;
			break;
		}
		
	}
	}
}
