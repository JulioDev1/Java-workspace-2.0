package Application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrentCurrecy;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("what dolar do you need ?");
		double amount = sc.nextDouble();
		System.out.println("what dolar price ?");
		double dolarPrice = sc.nextDouble();
		double result = CurrentCurrecy.converter (amount, dolarPrice);
		System.out.printf("total result : %.2f%n", result);
	
		sc.close();
		

	}

}
