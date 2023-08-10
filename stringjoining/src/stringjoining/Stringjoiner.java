package stringjoining;
import java.util.Scanner;


public class Stringjoiner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter str1 and str2");
		String a=scan.next();
		String b=scan.next();
		System.out.println(joinStrings(a,b));
	}
	public static String joinStrings(String a,String b) {
		return a+b;
	}

	
	}


