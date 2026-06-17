package Basics;

public class Oparator {

	public static void main(String[] args) {
		
//Arithmetic operators
		int Num_1,Num_2,Addition,Subtraction;
		double Mul,div,Mod;
		Num_1=5;
		Num_2=7;
		
		Addition=Num_1+Num_2;
		Subtraction=Num_1-Num_2;
		Mul=Num_1*Num_2;
		div=Num_1/2;
		Mod=27%5;
		
	System.out.println("Arithmetic Oparation");
	System.out.println("----------------------------------");
	System.out.println("Addition :"+Addition);
	System.out.println("Subtraction :"+Subtraction);
	System.out.println("Mul :"+Mul);
	System.out.println("div :"+div);
	System.out.println("Mod :"+Mod);
	System.out.println("----------------------------------\n");
	
	System.out.println("Relational Oparator's");
	
	System.out.println("----------------------------------");
	
		boolean isequal=(Num_1==Num_2);
		boolean les=Num_1>Num_2;
		boolean gret=Num_1<Num_2;
		
	System.out.println("Num_1=Num_2 :"+isequal);
	System.out.println("Num_1>Num_2 :"+les);
	System.out.println("Num_1<Num_2 :"+gret);
	
	System.out.println("----------------------------------");
	
	System.out.println("Logical Oparator\n");
	System.out.println("----------------------------------");
		
			String UserName="ArunJohi04";
			String password=new String("@Arun004");

//And && @Multiplication
			
		System.out.print("Login Page :");
		
		if(UserName.equals("Arunjohi04")&&password.equals("Arunjohi04"))
			System.out.println("Login Successfully");
		else
			System.out.println("Data Error");
	
//OR || @Addition
		
	System.out.print("Login Page :");
	
		if(UserName.equals("ArunJohi04")||password.equals("Arunjohi04"))
			System.out.println("Login Successfully");
		else
			System.out.println("Data Error");
		
//Not ! @Opposite value
		
		boolean x=false;
	System.out.println("Not  Gate :"+!x);
	System.out.println("----------------------------------");
	}
}