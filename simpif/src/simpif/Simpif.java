package simpif;
import java.util.Scanner;

public class Simpif {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=scan.nextInt();
		System.out.println("well come to kodnest");
		Ifapp app=new Ifapp();
		 app.check(marks);
		
	}
	

}
