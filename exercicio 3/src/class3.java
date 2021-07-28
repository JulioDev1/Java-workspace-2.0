import java.util.Scanner;
import java.util.Locale;
public class class3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double S, horas, Salario;

		System.out.println("ola informe o salario e horas que individuo");
		S = sc.nextDouble();
		horas = sc.nextDouble();
		Salario = S*horas;
		System.out.printf("Salario Total: %.2f %n", Salario);
		

	}

}
