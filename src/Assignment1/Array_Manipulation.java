package Assignment1;

import java.util.*;
class Array_Manipulation{
	public static void main(String[] args){
		
		Basics line=new Basics();
		
//1)find the sum of all the elements in an array of integers.
		
		int[] arr= {1,2,3,4,6,7,8,9};
		ArrayList<Integer> arraylist=new ArrayList<>();
		
		int count=0;
		for(int x:arr) {
			arraylist.add(x);
			count+=x;
		}
		System.out.println(arraylist);
		System.out.println("Calculated value of total Array :"+count);
		
		line.line();
//2)find the largest element in an array of integers.
		
		int[] arr1= {1,5,899,89,34};
		int max=arr1[0];
		
		for(int i=1;i<arr1.length;i++) {
			if(max<arr1[i]) {
				max=arr1[i];
			}
		}
		System.out.println(max);
		
		line.line();
		
//3)find the average of all the elements in an array of doubles.
		
		int[] marks={90,89,76,67,98,100};
		double avg=0;
		
		for(int x:marks) {
			avg+=x;
		}
		avg=avg/marks.length;
		
		System.out.println("Avarage Marks :"+avg);
		line.line();
		
//4)print the elements of an array of strings in reverse order.
		
		String[] name={"Arun","Kumar","Saran","Kathirvel"};
		for(int i=0;i<name.length;i++)
			name[i]=new StringBuilder(name[i]).reverse().toString();
		
		
		for(String x:name)
			System.out.println(x);
		
		line.line();
		
//5)print the first 10 numbers of the Fibonacci sequence.
		int n=10;
		int a=0,b=1;
		int[] arrs=new int[n+2];
		arrs[0]=a;
		arrs[1]=b;
		for(int i=2;i<=n+1;i++) {
			arrs[i]=a+b;
			int temp=a;
			a=b;
			b=temp+b;
		}
		for(int x:arrs) {
			System.out.print(x+" ");
		}
	}
}