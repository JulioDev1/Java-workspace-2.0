package Application;
import java.util.Locale;
import java.util.Scanner;
import banco.Operacoes;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Operacoes operacoes;

		System.out.println("Olá! seja Bem vindo ao banco Qualquer!");
		System.out.println("vamos fazer um cadastro inicial");
		int cadastro = sc.nextInt();
		
		System.out.println("informe o seu nome");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("deseja realizar algum deposito s-sim ou n-nao ?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("informe o valor inicial para deposito");
			double depositoInicial = sc.nextDouble();
			operacoes = new Operacoes(cadastro, nome, depositoInicial);
		}else {
			operacoes = new Operacoes(cadastro, nome);
		}
		System.out.println();
		System.out.println(operacoes);
		
		System.out.println("entre com outro valor de deposito");
		double valorDepositado = sc.nextDouble();
		operacoes.deposito(valorDepositado);
		
		System.out.println("sua conta agora");
		System.out.println(operacoes);
		
		System.out.println("informe quanto vc quer sacar");
		double valorSaque = sc.nextDouble();
		operacoes.saque(valorSaque);
		System.out.println(operacoes);
		
		
		
		

		sc.close();

	}

}
