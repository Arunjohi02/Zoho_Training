package Assignment;

public class Star_pattern {

	public static void main(String[] args) {
		Basics line=new Basics();
		int n=5; //Row And Colum value
//1)
		System.out.println("Pattern 1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		line.line();
		System.out.println();
//2)
		System.out.println("Pattern 2");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		line.line();
		System.out.println();
		
//3)
		System.out.println("Pattern 3");
		for(int i=0;i<n;i++) {
			for(int space=0;space<n-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		line.line();
		System.out.println();
//4)
		System.out.println("Pattern 4");
		
		for(int i=0;i<n;i++) {
			for(int space=n-i;space>0;space--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int space=0;space<i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		line.line();
		System.out.println();
		
//5)
		System.out.println("Pattern 5");
		
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			for(int k=1;k<i;k++) {
				System.out.print(k);
			}
			for(int space=1;space<n-i;space++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		line.line();
		System.out.println();
		
//6)
		System.out.println("Pattern 6");	
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		line.line();
		System.out.println();
//7)
		System.out.println("Pattern 7");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 ||i==n) {
					System.out.print("*");
				}else if(j==1) {
					System.out.print("*");
				}else if(j==n){
					System.out.print(" *");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		line.line();
//8)
		System.out.println("Pattern 8");
		
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<=(2*i-1);j++) {
				if(j==1 ||j==(2*i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int space=i;space<=n;space++) {
				System.out.print(" ");
			}for(int j=1;j<=(2*i-1);j++) {
				if(j==1 || j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}