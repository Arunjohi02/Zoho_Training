package Assignment1;
import java.util.*;

public class Level2 {
	boolean vowels(String x) {
		char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
		String Name=x;
		for(int i=0;i<Name.length();i++){
			for(int j=0;j<vowels.length;j++) {
				if(Name.charAt(i)==vowels[j]) {
					return true;
				}
			}
		}
		return false;
	}
	boolean ispolindrome(String x) {
		x=x.replace(" ","");
		StringBuilder rev=new StringBuilder(x);
		if(x.equalsIgnoreCase(rev.reverse().toString())) {
			return true;
		}
		return false;
	}
	
	String occurrences(String x,String target){
		
		return x.replaceAll("(?i)"+target,"");
	}
	
	int indexvalue(int[] x,int target) {
		for(int i=0;i<x.length;i++) {
			if(target==x[i]) {
				return i;
			}
		}
		return -1;
	}
	
	ArrayList<Integer> valueRepeat(int[] x){
		
		
		ArrayList<Integer> arrs=new ArrayList<>();
		int[] arr=x;

		if(arr.length==2) {
			if(arr[0]==arr[1]) {
				arrs.add(arr[0]);
			}
		}
		
		for(int i=0;i<=arr.length/2;i++) {
			for(int j=arr.length-1;j>arr.length/2;j--) {
				if(arr[i]==arr[j]) {
				arrs.add(arr[i]);
				}
			}
		}
		return arrs;
		
	}
//9
	ArrayList<Integer> subarray(int[] s){
		ArrayList<Integer> list=new ArrayList<>();
		int[] nums =s;
		
		int maxlen=1;
		int curentlen=1;
		
		int start=0;
		int maxstart=0;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>nums[i-1] ){
				curentlen++;	
			}else {
				curentlen=1;
				start=i;
			}
			if(curentlen>maxlen) {
				maxlen=curentlen;
				maxstart=start;
			}
		}
		for(int i=maxstart;i<maxstart+maxlen;i++) {
			list.add(nums[i]);
		}
		return list;
	}
	public static void main(String[] args) {
		Basics line=new Basics();
		Level2 obj=new Level2();
		Scanner io=new Scanner(System.in);
		
//1) check if a vowel is present in the string.
		
		System.out.println("Write a program to check if a vowel is present in the string.\n");
		String result1 =(obj.vowels("aAnt"))? "true":"false";
		String result2 =(obj.vowels("Brklmn"))? "true":"false";
		System.out.println(result1);
		System.out.println(result2);
		
		line.line();
		
//2)Third largest number in an array.
		
//		  int[] arrs={10, 5, 11, 100, 15, 12, 13};
		  int[] arrs={13, 2, 4, 15, 12, 10, 5};
	        int temps;
	        int s1=arrs[0],s2=arrs[1],s3=0;
	        for(int i=2;i<arrs.length;i++) {
	            if(s1<arrs[i]){
	                temps=arrs[i];
	                s3=s1;
	                s1=temps;
	            }
	            if(s2<s3) {
	                temps=s2;
	                s2=s3;
	                s3=temps;
	            }
	            else if(s2<arrs[i]){
	              temps=s2;
	              s2=arrs[i];
	              s3=temps;
	             }else if(s3<arrs[i] && s2>arrs[i]) {
	            	 s3=arrs[i];
	             }
	        }
	  
	        System.out.println("Third largest number of the Array is :"+s3);
	        line.line();
//3)palindrome
		System.out.println("Write a program to find out if the given string (ignore the spaces in the string) is palindrome or not.\n");
		
		boolean str1=obj.ispolindrome("abBa");
		boolean str2=obj.ispolindrome("a     b  cba ");
		boolean str3=obj.ispolindrome("ab ");
		
		System.out.println(str1? "Yes Polindrome ":"No Polindrome");
		System.out.println(str2? "Yes Polindrome":"No Polindrome");
		System.out.println(str3? "Yes Polindrome":"No Polindrome");
		
		line.line();
		
//4)Fibonacci series
		
		System.out.println("Write a program to generate Fibonacci series up to given number 'n'. \n");
		int a=0,b=1;
		int n=10;
		ArrayList<Integer> list=new ArrayList<>();
		list.add(a);
		list.add(b);
		while(true) {
			if(n!=0) {
				list.add(a+b);
				int temp=a;
				a=b;
				b=temp+a;
				n--;
			}
			else {
				break;
			}	
		}
		System.out.println(list);
		
		System.out.println();
		line.line();
		
//5)sort the elements in odd positions in descending order and elements in even positions in ascending order;
		
		int[] arr={13, 2, 4, 15, 12, 10, 5};
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
		}
		
		
		line.line();
		
//6)
		 System.out.println("Write a program to remove all occurrences of a given character from input String.\n");
		 System.out.println(obj.occurrences("ABCabc", "a"));
		 System.out.println(obj.occurrences("ABCabc", "d"));
		 
		 line.line();
		 
//7)print the distinct numbers
		 
		 System.out.println(obj.valueRepeat(new int[] {1, 4, 5, 3, 1, 5}).isEmpty()? "{} -\\\" No value Repeat\\\"":obj.valueRepeat(new int[] {1, 4, 5, 3, 1, 5}));
		 System.out.println(obj.valueRepeat(new int[] {1, 4, 5, 3}).isEmpty()? "{} -\" No value Repeat\"":obj.valueRepeat(new int[] {1, 4, 5, 3}));
		 System.out.println(obj.valueRepeat(new int[] {1, 1}).isEmpty()? "{} -\\\" No value Repeat\\\"":obj.valueRepeat(new int[] {1, 1}));
		 
		 
		 line.line();
		 
//8)find indexvalue		
		 
		 System.out.println("Write a program to print the index of the given element in an array.\n");
		 System.out.println(obj.indexvalue(new int[]{1, 5, 3, 7},1));
		 System.out.println(obj.indexvalue(new int[] {10, 22, 33, 25, 32, 54, 64, 1},100));

		 line.line();
		
//9.Find the longest increasing sub-array in array.
		
		 System.out.println("Find the longest increasing sub-array in array .");
		System.out.println(obj.subarray(new int[] {1, 5, 3, 7}));
		System.out.println(obj.subarray(new int[] {10, 22, 33, 25, 32, 54, 64, 1}));
		
		
		io.close();
	}
}