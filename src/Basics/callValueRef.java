package Basics;

public class callValueRef {

	void callbyvalue(int a) {
		 a=a*5;
	}
	
	int callbyreference(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			return arr[i]*2;
			}
		return 0;
		
	}
	public static void main(String[] args) {
		Line line=new Line();
		callValueRef opj=new callValueRef();
		line.Line();
//call by value
		System.out.println("Call by value");

		line.dataline();
		
		int a=5;
		int[] arr= {1,2,3};
		String[] str= {"Hello","World"};
		
		System.out.print("int a:"+a+"\nArray :");
		for(int x:arr) {
			System.out.print(x+",");
		}
		System.out.println();
		System.out.print("Str :");
		for(String x:str) {
			System.out.print(x+",");
		}
		System.out.println("\n");
		line.dataline();
		
		
//call  by value
		
		opj.callbyvalue(a);
		System.out.println(a);
		
//call by reference
		opj.callbyreference(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		line.Line();
	}
	
}