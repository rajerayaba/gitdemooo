package basicprograms;

import java.util.Scanner;

public class printinginteger {
	
	public void mixmilk() {
		
		
	}
	static double amountperfat=6.20;
	static double bonusamt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fat,milkQty,bonusamt,Bamt,Finalamt;
		double totalamt;
		String type,cow = null,buffalo = null;
		System.out.println("Enter the milk Quantity");
		Scanner s= new Scanner(System.in);
		milkQty=s.nextInt();
		System.out.println("Enter the type of milk");
		type=s.next();
		if(type==cow)
		{
			bonusamt=(6*milkQty);	
		}
		else if(type==buffalo)
		{
			bonusamt=(6*milkQty);
		}
		
		
		System.out.println("Enter the milk fat");
		fat= s.nextInt();
		totalamt=(milkQty*fat*amountperfat+bonusamt);
		System.out.println("Total amount is" +totalamt);
		System.out.println("Enter the balance amount");
		Bamt=s.nextDouble();
		Finalamt=(totalamt-Bamt);
		System.out.println(" the amount to be given"+ Finalamt);
		
		


	}

}
