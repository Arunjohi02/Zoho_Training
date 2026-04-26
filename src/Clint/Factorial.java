package Clint;
import java.util.Scanner;
public class Factorial {
	static int factorial(int a) {
		if(a==0)
			return 1;
		else 
			return a*factorial(a-1);
	}
	public static void main(String args[]) {
		int a;
		Scanner io=new Scanner(System.in);
		System.out.print("Enter the Finding Fact Value :");
		a=io.nextInt();
		System.out.println("Factorial of "+a+" is :"+factorial(a));
	}
}
