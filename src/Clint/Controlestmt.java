package Clint;

public class Controlestmt {

	public static void main(String[] args) {
		
//Contitional Statements
		
//1.if else control stmt
		
		System.out.println("-----------------------------------------");
		System.out.println("if Else:-");
		int x=5;
		if(x==5)
			System.out.println("Is equals");
		else
			System.out.println("Not equals");
		
//2.Nested if control stmt
		
		System.out.println("\nNested if:-");
		
		boolean bike;
		String shop,drink;
		
		bike=true;
		shop="Bell";
		drink="7up";
		
		if(bike==true)
		{
			if(shop=="KFC")
			{
				if(drink=="7up")
					System.out.println("Njoy the Day");
				else
					System.out.println("7up Not Available");
			}
			else
				System.out.println("Not A KFC");
		}else
			System.out.println("No Bike");
		
		
//3.If else Ladder
		
		System.out.println("\nif else Ladder :-");
		
		int mark=90;
		if(mark>=90){
			System.out.println("Grade A");
		}
		else if(mark>=80)
		{
			System.out.println("Grade B");
			}
		else if(mark>70)
		{
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}

		
//4.Switch case
		
		System.out.println("\nSwitch Case:-");
		int Today=5;
		System.out.print("Today is :");
		
		switch(Today){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("Thesday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default :
				System.out.println("Data Error");
				break;
				
		}
		System.out.println("-----------------------------------------");
	}
}