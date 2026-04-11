package Clint;
public class Variables
{
	public static void main(String[] args) 
	{
// Example 1:
		
		int num1,num2;
		num1=10;
		num2=20;
		System.out.println("The sum of "+num1+" and "+ num2 +" is "+(num1+num2));

//Practice Question
		
//	1.Example

		int age;
		age=22;
		System.out.println("Age :"+age);
		
//	2.Example
		
		double Total_praice;
		float product_1=12.5f;
		float product_2=13.5f;
		Total_praice=product_1+product_2;
		System.out.println("Total price: "+Total_praice);
		
//	3.Example
		//String variable
		String Msg;
		Msg=new String("Hii This is Zoho Training Platform..........");
		System.out.println(Msg);
		
//	4.Example
		double  Latitude,Longitude;
		Latitude=90;
		Longitude=180;
		System.out.println("Latitude :"+Latitude+"\nLongitude :"+Longitude);
//	5.Example
		boolean vote;
		//Are you eligible  for Vote in 2026
		vote=true;
		System.out.println("Are you Eligible for vote: "+"\'"+vote+"\'"); 
	}
}