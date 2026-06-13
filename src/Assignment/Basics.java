package Assignment;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
class Basics {
	static void line(){
		System.out.println("-----------------------------------------------------");
	}

	public static void main(String[] args) {
		
         Scanner io=new Scanner(System.in);
//1)
         
         System.out.println("Hello, world!");
         
//2)
         System.out.print("Enter your Name :");
         String name;
         name=io.nextLine();
//         name=" ";
         System.out.println("Wellcome to Mr."+name+"\n\tEnjoy the Moments");
         
line();

//3)
         
         int num1=20;
         int num2=25;
         
         if(num1==num2)
        	 System.out.println("\nNum1 And Num2 is Equal");
         
        else if(num1<num2)
             System.out.println("\nNum1 is less then Num2");
        else
        	 System.out.println("\nNum1 is Grater then Num2");
         
line();
         
//4)
         int user;
         System.out.print("\nEnter A Number :");
//         user=3;
user=io.nextInt();
         
         if(user==0)
        	 System.out.println("Given number is Zero");
         else if(user<0)
        	 System.out.println("Given number is Negative number ");
         else
        	 System.out.println("Given number is Positive number ");
         
line();
        
//5)

         int age;
         System.out.print("\nEnter Your Age :");
         age=25;
age=io.nextInt();
         
         if(age>=18)
        	 System.out.println("You are an adult.");

         else
        	 System.out.println("You are not yet an adult.");

line();
//6)
         System.out.print("\nEnter Your temperature in Celsius :");
         double temperature;
temperature=io.nextDouble();
         temperature=948.88;
         double Fahrenheit=(temperature*9/5)+32;
         System.out.println("\n\tTemperature in Fahrenheit is:"+Fahrenheit);
         
line();
         
//7)  
         Random random=new Random();
         
         int user_input=1,random_num=0;
         
         System.out.println("Random Guess Game: ");
         
         while(user_input!=random_num)
         {
        	 random_num=random.nextInt(1,10);	 
        	 
        	 System.out.print("Enter the number inbetwwen 1-10 :");
        	 user_input=io.nextInt();
        	 if(user_input==random_num){
        		 System.out.println("Congrats!!!!");
        		 System.out.println("Yours guess Number is Crt.");
        	 }
        	 else
        		 System.out.println("Try Again...");
         }     
         
line();
         
         
//8)
         System.out.print("\nEnter Your value inbetween 1-100 :");
         int number;
//number=45;
         number=io.nextInt();
         if(number<=50 && number>1)
        	 System.out.println("The number is in the lower half.");
         else if(number>51 && number<100)
        	 System.out.println("The number is in the upper half.");
         else
        	 System.out.println("Invalid number.");
         
line();
        
//9)

//10)    
        int Num1,Num2;
        Num1=5;Num2=6;
        System.out.println("\nNum1="+Num1);
        System.out.println("Num2="+Num2);
        System.out.println("Adding Two Values :"+(Num1+Num2));
        
line();

 //11)
        
        int gues=1,random_number=0,point=0;
        
        while(gues!=random_number) {
        	random_number=random.nextInt(1,100);
        	System.out.println("Ran="+random_number);
        	System.out.print("Enter the number inbetween 1-100:");
        	gues=io.nextInt();
        	if(random_number==gues){
        		System.out.println("Correct Answer");
        		if(point==0) {
        			System.out.println("Wowwwwww!!!!!!");
        			System.out.println("Super Gues.....");
        			System.out.println("You Are Gues Single take.....");
        		}else {
        			System.out.println("You are take "+point+" Times");
        		}
        	}
        	else
        		point++;
        }
        
line();
        
//12)
        
        String User_Name="Zoho";
        
        for(int i=User_Name.length()-1;i>=0;i--)
        	System.out.print(User_Name.charAt(i));
        System.out.println();
        line();
      
//13)
        int[] arr={12,2,54,3,2,1};
        int calculate=0;
        for(int x:arr) {
        	calculate+=x;
        }
        System.out.println("Calculated value of Array is:"+calculate);
        
line();
        
//14)   

        System.out.print("Enter the String :");
        String original=io.nextLine();
        
        StringBuilder rev=new StringBuilder(original);
        
        String reverce=rev.reverse().toString();
        
        if(original.equalsIgnoreCase(reverce))
        	System.out.println("Given String is palindrome ");
        else
        	System.out.println("Given String is Not a palindrome ");
        
line();
       
//15)
        
        int[] value=new int[10];
        for(int i=0;i<value.length;i++) {
        	value[i]=random.nextInt(1,100);
        }
        for(int x:value) {
        	System.out.print(x+",");
        }
        System.out.println();
        
//int[] value={1,2,3,6,8,0,13,4,67,98,9,0,-9};
        
        int min=value[0],max=value[0];
        for(int i=1;i<value.length;i++) {
        	if(max<value[i]) {
        		max=value[i];
        	}else if(min>value[i]){
        	    min=value[i];
        	}
        }
        
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
        
line();

//16)

       ArrayList<String> names=new ArrayList<>();
       System.out.print("Enter the name :");
       for(int i=0;i<5;i++) {
    	   names.add(io.nextLine());
       }
       
       Collections.sort(names);
       
       for(String s:names) {
    	   System.out.println(s);
       }
//17)
		System.out.print("Enter Multiplication Table :");
		byte table=io.nextByte();
		
		System.out.println();
		System.out.println("\""+table+"\""+" th Multiplication Table :");
		System.out.println();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+table+"="+i*table);
		}
         io.close();
	}
}