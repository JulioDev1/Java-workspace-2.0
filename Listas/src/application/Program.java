package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("informe quantos funcionarios que serão cadastrados");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println("funcionario"+i+"*");
			
			System.out.print("Id:");
			int id = sc.nextInt();
				while(hasId(list, id) ) {
					System.out.println("esse cadastro ja existe por favor informe outro");
					  id = sc.nextInt();
				}
		
			System.out.println();
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println();
			
			System.out.print("Salario:");
			double salario = sc.nextDouble();
			list.add(new Employee(id,nome,salario));
		}
			System.out.println("informe id para ser percorrido e encontrado");
			int id = sc.nextInt();
			Employee resultado = list.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
			
			if(resultado == null) {
				System.out.println("resultado nao encontrado!");
				
			} else {
				System.out.println("informe a porcentagem");
				double porcentagem = sc.nextDouble();
				resultado.aumentarSalario(porcentagem);
			}
			System.out.println();
			System.out.println("informe a porcentagem");
			for (Employee obj : list) {
				System.out.println("List");
				System.out.println(obj);
			}
			
			sc.close();
			}
	public static boolean hasId(List<Employee> list, int id) {
		Employee resultado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return resultado != null;
	
			
		
		}
}
		
		



