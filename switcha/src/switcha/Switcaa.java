package switcha;
import java.util.Scanner;
public class Switcaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number from 1-7");
		int num=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("sunday");
			break;

		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("youu idiot go to hellll!!!");
		}
				
		
			

		
		

	}

}
