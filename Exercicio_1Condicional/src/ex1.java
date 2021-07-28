import java.util.Scanner;
import java.util.Locale;
public class ex1 {

	public static void main(String[] args) {
		
		double a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite os valore de a e b");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if(a % b!=0) {
			
			System.out.println("o numero nao é multiplo");
			
		} 
		else {
			
			System.out.println("o numero é multiplo");
			
		}
		
	}

}
