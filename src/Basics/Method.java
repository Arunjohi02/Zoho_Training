package Basics;

public class Method {

	public static void main(String[] args) {
		Line line=new Line();
		Method opj=new Method();
		line.Line();
		System.out.println("Types Of Method: \n"
				+"\t Static Method., \n"
				+ "\t return type Method.,\n"
				+ "\t Non Return type Method.,\n"
				+ "\t parameter passing Method.,\n"
				+ "\t recursion");
		line.Line();
		
		//static method calling 
		System.out.print("Static method: ");
		helo();
		
		//non return type using Opject
		//[arameter Passing Method
		System.out.print("Non return Type method: ");
		opj.Addition(5,2);
		
		//return type method
		System.out.print("return Type method: ");
		System.out.println(opj.Add(4, 6));
	}
	
//Static Method
	
	public static void helo() {
		System.out.println("Hello,World");
	}

//NonReturn Type Method
	
	void Addition(int a,int b) {
		System.out.println("Addition :"+(a+b));
	}
	
	int Add(int a,int b) {
		return a+b;
	}
}
