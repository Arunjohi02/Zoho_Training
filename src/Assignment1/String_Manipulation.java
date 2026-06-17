package Assignment1;
import java.util.*;
public class String_Manipulation{
	
	boolean check_anagrams(String x,String y){
		
		x.toUpperCase();
		y.toUpperCase();
		
		char[] array1=x.toCharArray();
		char[] array2=y.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1,array2))
			return true;
		return false;
	}
//2.find the length of the longest substring without repeating characters in a given string.
	void longestsubstring(String s) {
		HashSet<Character> hs=new HashSet<>();
		int max=0;
		int left=0;
			for(int i=0;i<s.length();i++) {
				while(hs.contains(s.charAt(i))) {
					hs.remove(s.charAt(left));
					left++;
				}
			hs.add(s.charAt(i));
			max=Math.max(max,i-left+1);
			}
		System.out.println("Original :"+s);
		System.out.println("Longest substring Count :"+max);
	}
//4.find the most frequent character in a given string.
	char mostfrequent(String x) {
	String word=x;
	word=word.toUpperCase();
	char mostfreq=word.charAt(0);
	int maxcount=Integer.MIN_VALUE;
	
	for(int i=0;i<word.length();i++) {
		
		int counts=0;	
		for(int j=0;j<word.length();j++) {
			if(word.charAt(i)==word.charAt(j))
				counts+=1;;	
		}
		if(maxcount<counts) {
			maxcount=counts;
			mostfreq=word.charAt(i);
		}
	}
	
	return mostfreq;
	
}
	public static void main(String[] args){
		
		Basics line=new Basics();
		String_Manipulation res=new String_Manipulation();	
		
//1) reverse a given string without using any built-in function.
		
		String original="Hello World";
		String temp="";
		for(int i=original.length()-1;i>=0;i--){
			temp+=original.charAt(i);
		}
		System.out.println(temp);
		System.out.println();
		line.line();
		System.out.println();
//2.find the length of the longest substring without repeating characters in a given string.
		
		res.longestsubstring("abcsdabcdabcderfgsnabcd");
		line.line();
		System.out.println();
//3 count the number of words in a given string.
		String centence="Hi am Software Developer in Zoho";
		byte word_count=1;
		for(int i=0;i<centence.length();i++){
			if(centence.charAt(i)==' '){
				word_count++;
			}
		}
		System.out.println("Total words Count :"+word_count);
		
		System.out.println();
		line.line();
		System.out.println();
//4.find the most frequent character in a given string.
		
		System.out.println(Character.toLowerCase(res.mostfrequent("Banana")));
		System.out.println(Character.toLowerCase(res.mostfrequent("zoho Training")));
		
		System.out.println();
		line.line();
		System.out.println();
//5 check if two given strings are anagrams or not.
	
	String s1="geeks";
	String s2="sgeke";
	String s3="words";
	String s4="srwow";
	
	System.out.println((res.check_anagrams(s1, s2))?"Anagrams":"Not a Anagrams");
	System.out.println((res.check_anagrams(s3, s4))?"Anagrams":"Not a Anagrams");
	
	System.out.println();
	line.line();
	System.out.println();
	
//6.to remove all the white spaces from a given string
	String Word="Hello World";
	
	String remove=Word.replace(" ", "");
	System.out.println("Origial :"+Word);
	System.out.println("white spaces remove :"+remove);
	
	System.out.println();
	line.line();
	System.out.println();
	
//7.capitalize the first letter of each word in a given string.
	String word="capitalize the first letter";
	String[] arr=word.split(" ");
	String result="";
	
	   for(String str:arr) {
		   result+=Character.toUpperCase(str.charAt(0))+str.substring(1)+" ";	
	   }
	   
	   System.out.println("Original :"+word);
	   System.out.println("Modified :"+result);
    }
}