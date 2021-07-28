package principal;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Application {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("olá! informe seu nome :");
		employee.name = sc.nextLine();
		
		System.out.print("informe seu salario");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("informe a taxa:");
		employee.tax = sc.nextDouble();

		System.out.print("informe o acrescimo que voce em tem");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();

		System.out.println("salario com imposto "+ employee);
		
		sc.close();
		
		
		

	}

}
