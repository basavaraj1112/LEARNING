package tempconv;
import java.util.Scanner;
public class Temperatur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter farhenit value");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter t3=new TemperatureConverter();
		double q= t3.cTc(fahrenheit);
		System.out.println(q);
		
		
		

	}

}
