package Assignment1;
import java.util.*;
class Recursion {
	
//1.Find all possible permutations of a given string using recursion.
	HashSet<String> z=new HashSet<>();	
	
	HashSet<String> permutations(String x,String y) {	
			
		String ques=x;
		String ans=y;
		
		if(ques.length()==0) {
			z.add(ans);
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String res=ques.substring(0,i)+ques.substring(i+1,ques.length());
			permutations(res,ans+ch);
		}
		return z;
	}
	
//2.to find the Fibonacci sequence up to a given limit using looping.
	
	int Fibonacci(int x) {
		if(x==0)
			return 0;
		if(x==1)
			return 1;
		return Fibonacci(x-1)+Fibonacci(x-2);
	}
	
	
//3.to check if a given number is a prime number using recursion.
	
	boolean isprime(int n) {
		boolean isprime=true;
		int i=2;
		while(n>=i) {
			if(i==2||i==3)
				isprime=true;
			else if(i%2==0||i%3==0)
				isprime=false;
			else 
				isprime=true;
			i++;
		}
		return isprime;
	}
	
//4.calculate the factorial of a given number using recursion.
	
	int Factorial(int x) {
		if(x==0||x==1) {
			return 1;
		}else {
		return x*Factorial(x-1);
		}
	}
	
//6.To generate the first n prime numbers using looping.
	
	void Prime(int n) {
		int i=2;
		while(i<=n) {
			if(i==2||i==3)
				System.out.println(i);
			else if(i%2==0||i%3==0);
			else
				System.out.println(i);
			i++;
		}
	}
//7.Greatest common divisor (GCD) of two numbers using recursion.
	int GCD(int a,int b) {
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
	
//8.Find the least common multiple (LCM) of two numbers using looping.
	int LCM(int a,int b) {
		int max;
		if(a<b)
			max=b;
		max=a;
		while(true) {
			if(max%a==0 && max%b==0) {
				return max;
			}
			max++;
		}
	}
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		Basics line=new Basics();
		Recursion obj=new Recursion();
		
//1.Find all possible permutations of a given string using recursion.
		
		ArrayList<String> result=new ArrayList<>();
		HashSet<String> hs=obj.permutations("ABC","");
		
		for(String x:hs) {
			result.add(x);
		}
		Collections.sort(result);
		
		System.out.println(result+"\n");
		line.line();
		
//2.to find the Fibonacci sequence up to a given limit using looping.
		
		System.out.println("Enter the finted Fibonacci Value :");
		int Fibonacci=io.nextInt();
		System.out.println("The Fibonacci value of "+Fibonacci+" is :"+obj.Fibonacci(Fibonacci)+"\n");
		line.line();
		
//3.to check if a given number is a prime number using recursion.	
		
		System.out.println((obj.isprime(5))? "Prime":"Not A prime\n");
		line.line();
		
//4.calculate the factorial of a given number using recursion.
		
		System.out.print("Enter the Factorial Range :");
		int n=io.nextInt();
		System.out.println("Factorial of "+n+" is :"+obj.Factorial(n)+"\n");		
		line.line();
		
//6.to generate the first n prime numbers using looping.
		
		obj.Prime(10);
		line.line();
//7.Greatest common divisor (GCD) of two numbers using recursion.
		int num1=12,num2=18;
		System.out.println("Numer 1 :"+num1);
		System.out.println("Numer 2 :"+num2);
		System.out.print("Greatest common divisor(GCD) :"+obj.GCD(num1,num2)+"\n");
		
		line.line();
//8.find the least common multiple (LCM) of two numbers using looping.
		int num3=3,num4=3;
		System.out.println("Num1 :"+num3);
		System.out.println("Num2 :"+num4);
		System.out.println("Least common multiple(LCM) :"+obj.LCM(num3, num4));
	}
}