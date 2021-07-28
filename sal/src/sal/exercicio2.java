package sal;
import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, pi, raio;

		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * (raio * raio);
		System.out.printf("area = %.4f %n", area);

	}

}
