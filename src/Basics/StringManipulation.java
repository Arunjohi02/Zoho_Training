package Basics;

public class StringManipulation {

	public static void main(String[] args) {
		Line line=new Line();
		
		String str1="Hello";
		String str2="World";
		
		//Two String Add using Arithmetic oparator
		
		String str3=str1+str2;
		System.out.println("String Concadinate using Arithmettic oparator :"+str3);
		
		//Two String Adding using concadinate method
		
		System.out.println("String Concadinate using Concadinate method :"+(str1.concat(str2)));
		
		//String convert to the upercase
		
		System.out.println("String Convert to Upercase: "+str1.toUpperCase());
		
		//String convert to the Lowercase

		System.out.println("String Convert to Upercase: "+str1.toLowerCase());
		

		line.Line();
//practice 2
		
System.out.println("\nExample No :2\n");

		String value1=new String("Hello,");
		String value2=new String("World");
		
		line.dataline();
		System.out.println("Orininal value :");
		System.out.println("First String :"+value1);
		System.out.println("Secont String :"+value2);
		
		line.dataline();
		
		//find length
		
		System.out.println("Length of the String :"+value1.length());
		
		String concadinate=value1.concat(value2);
		System.out.println("Find Comma index :"+concadinate.indexOf(","));
		
		//Replace value world to Java
		
		System.out.println("String Replace :"+concadinate.replace("World", "Java!!"));
		
		//get SubString in the String value
		
		System.out.println("Get SubString :"+concadinate.substring(0,5));
		
		//check String equals
		
		String isequal=(value1.equalsIgnoreCase(value2))? "is Equals":"Not Equal";
		System.out.println("Check String Equals or not: "+isequal);
		
		line.Line();
	}

}
