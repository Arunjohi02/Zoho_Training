package Assignment;

import java.util.ArrayList;

class Array_manipulation2{
	
//1.find the second largest element in an array of integers.
	int secondLarge(int[] x) {
		int first,second;
		first=x[0];
		second=0;
		for(int i=1;i<x.length;i++) {
			if(x[i]>first) {
				int temp=first;
				first=x[i];
				second=temp;
			}
		}
		return second;
	}
	
//2 find the smallest and largest elements in an array of integers.
	int[] FindValue(int[] x) {
		int samlest=x[0];
		int largest=0;
		
		for(int i=1;i<x.length;i++) {
			if(largest<x[i])
				largest=x[i];
			if(samlest>x[i])
				samlest=x[i];						
		}
		
		return new int[] {samlest,largest};
	}
	
//3.To sort an array of integers in ascending and descending order.
	
	int[] sort(int[] x) {
		int[] array=x;
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array.length;j++) {
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}

		return array;
	}
	
//4.Rotate the elements of an array by a given number of positions.
	
	int[] RotateArray(int[] x,int y) {
		int[] arr=x;
		int d=y;
		int temp=0;
		int k=0;
		for(int i=0;i<d;i++) {
			temp=arr[0];
			for(int j=1;j<arr.length;j++) {

				arr[k]=arr[j];
				k++;
				if(k==arr.length-1) {
					arr[k]=temp;
				    k=0;
				}
			}
		}
		return arr;
	}
	
//5.find the common elements between two arrays of integers.
	
	ArrayList<Integer> res(int[] x,int[] y){

		int[] arr1=x;
		int[] arr2=y;
		ArrayList<Integer> app=new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					app.add(arr1[i]);
					break;
				}
			}
		}
		return app;
	}
	
//6.sum of two matrices of the same size.
	
	int[][] Added_Matrix;
	
	void AddArray(int[][] x,int[][] y){
		int[][] A=x;
		int[][] B=y;
		int[][] c=new int[A.length][B.length];
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B[0].length;j++) {
				c[i][j]=A[i][j]+B[i][j];
			}
		}
		Added_Matrix=c;
	}
	
	void Addedres() {
		for(int i=0;i<Added_Matrix.length;i++) {
			for(int j=0;j<Added_Matrix[0].length;j++) {
				System.out.print(Added_Matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
//7.Find the transpose of a matrix.
	
	void Transpose() {
		int[][] arr= {{1,2,3},{4,5,6}};
		int[][] res=new int[arr.length][arr[0].length];
	
		System.out.println("Original Matrix :");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++)
					System.out.print(arr[i][j]+" ");
			
				System.out.println();
			}
	
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr.length;j++)
					res[j][i]=arr[j][i];
				
			}
			
	System.out.println("\nTransposed Matrix :");
	
			for(int i=0;i<res[0].length;i++) {
				for(int j=0;j<res.length;j++) 
					System.out.print(res[j][i]+" ");
		
				System.out.println();
			}
}
	
	public static void main(String[] args) {
		
		Array_manipulation2 obj=new Array_manipulation2();
		Basics line=new Basics();
		
//1.find the second largest element in an array of integers.
		
		int[] array1={1,2,8,0,2,10};
		System.out.print("Original :");
		
		for(int i:array1)
			System.out.print(i+" ");
		
		System.out.println("\nSecond Largest Number :"+obj.secondLarge(array1));
		line.line();
		
//2.find the smallest and largest elements in an array of integers.
		
		int[] array2={1,5,8,0,2,107,49,-1};
		int[] res=obj.FindValue(array2);
		
		System.out.print("Original :");
		
		for(int i:array2)
			System.out.print(i+" ");
		
		System.out.println("\nSmallest :"+res[0]);
		System.out.println("Largest  :"+res[1]);
		line.line();
		
//3. sort an array of integers in ascending and descending order.
				
		int[] array3=obj.sort(new int[]{1,5,8,0});
		
		System.out.print("Original :");
		for(int i:array3)
			System.out.print(i+" ");
		
		System.out.print("\nAscending  Order :");
		for(int i:array3)
			System.out.print(i+" ");
		
		System.out.print("\nDescending  Order :");
		
		for(int i=array3.length-1;i>=0;i--)
			System.out.print(array3[i]+" ");
		
		System.out.println();
		line.line();
		
//4.Rotate the elements of an array by a given number of positions.
		
		int[] array4={1,2,3,4,5,6,7};
		int d=2;
		System.out.print("Origianal :");
		for(int x:array4) {
			System.out.print(x+" ");
		}
		obj.RotateArray(array4,d);
		
		System.out.print("\n"+d+" Shift Rotated :");
		
		for(int x:array4) {
			System.out.print(x+" ");
		}
		System.out.println();
		line.line();
		
//5.find the common elements between two arrays of integers.	
		int[] array5={1,2,3,4,5,6,7};
		int[] array6={1,2,5,7,4,2,8};
		
		System.out.print("Array 1 :");
		for(int x:array5) 
			System.out.print(x+" ");
		System.out.println();
		
		System.out.print("Array 2 :");
		for(int x:array6) 
			System.out.print(x+" ");
		System.out.println();
		
		ArrayList<Integer> result=obj.res(array5,array5);
		System.out.print("common elements of the Array:");
		System.out.print(result+"\n");
		line.line();
		
//6.sum of two matrices of the same size.
		
		obj.AddArray(new int[][] {{1,2},{3,4}}, new int[][] {{1,2},{3,4}});
		obj.Addedres();
		
		line.line();
		
		obj.AddArray(new int[][] {{2,0,1},{3,5,2},{1,1,1}}, new int[][] {{1,4,2},{0,1,3},{5,2,0}});
		obj.Addedres();
		
		line.line();
//7.Find the transpose of a matrix.
		
		obj.Transpose();
		
	}
}