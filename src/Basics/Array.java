package Basics;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner io=new Scanner(System.in);
		
//Single Damentional Array
		int[] My_Array; //Array diclaration

		My_Array=new int[] {1,2,3,4,5}; //direct value assign
		
		System.out.println(My_Array[3]); //output :4
		System.out.println(My_Array[1]); //output :2
		
//value change

		My_Array[2]=10;
		System.out.println(My_Array[2]); //output :10 =>{1,2,10,4,5}
	
//value assign using Loop
		int[] arr;
		arr=new int[5];
		System.out.println("Enter the number :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=io.nextInt();
		}
		
		System.out.println("Output :");
		for(int x:arr) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------------");
//Multidiamentional Array
		
		int[][] Array=new int[2][2];
		Array[0][0]=5;
		Array[0][1]=4;
		Array[1][0]=3;
		Array[1][1]=2;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(Array[i][j]);
			}
		}
	}
}