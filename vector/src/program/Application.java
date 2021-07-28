package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Rent[] vect = new Rent[10];

		System.out.println("quantos quartos vc ira querer");
		int n = sc.nextInt();
	

		for (int i = 1; i <= n; i++){
			  System.out.println();
			  System.out.println("informe o seu nome");
			  sc.nextLine();
			  String nome = sc.nextLine();
			  
			  System.out.println("informe o seu email");
			  String email = sc.nextLine();
			  
			  System.out.printf("informe qual irá ficar");
			  int room = sc.nextInt();
			  
			  vect[room] = new Rent(nome, email);
		}
		System.out.println();
		System.out.println("quarto cadastrados");
		for (int i = 0; i <10; i++){
			  if (vect[i] != null) {
				  System.out.println(i + ":" + vect[i]);
			  }
		}
		sc.close();

	}

}
