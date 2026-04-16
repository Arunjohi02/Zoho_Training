package Clint;
import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		Scanner io=new Scanner(System.in);
//for loop
		
		System.out.println("need Number odd or Even :");
		String oparation=io.next();
		
		for(int i=1;i<=10;i++){
			if(oparation.equalsIgnoreCase("even")) {
				if(i%2==0)
					System.out.println(i);
			}else if(oparation.equalsIgnoreCase("odd")) {
				if(i%2!=0)
					System.out.println(i);
			}	
		}
		
		
System.out.println("Given number is Prime or Not ");
System.out.print("Enter a Number :");
		int n=io.nextInt();
		boolean isprime=true;
		
		if(n<=1)
			isprime=false;
		if(n<=3)
			isprime=true;
		if(n%2==0||n%3==0)
			isprime=false;
		
			String result=isprime? "prime":"Not a prime";
			
			System.out.println("Result :"+result);
			
			
//while
			int i=0;
			while(i<=10) {
				System.out.println(i);
				i++;
			}
			
			
//Do While
			int j=1;
			do{
				System.out.println("Hello Zoho....");
				j++;
			}while(j<=3);
			
			io.close();
	}
}