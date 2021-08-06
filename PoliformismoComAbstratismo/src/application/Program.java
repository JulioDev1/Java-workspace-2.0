package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> list = new ArrayList<>();

		System.out.println("how the number tax Payer ?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Individual or Company");
			char r = sc.next().charAt(0);
			System.out.println("name : ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("anual income: ");
			double anualIncome = sc.nextDouble();

			

			if (r == 'i') {
				System.out.println("health expenditures: ");
				int healthExpenditures = sc.nextInt();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} 
			else{

				System.out.println("number of employe :");
				Integer numberOfemploye = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfemploye));

			}
		}
		double sum = 0;
		System.out.println();
		System.out.println("taxas :");
		for (TaxPayer taxpayer : list) {
			double tax = taxpayer.tax();
			System.out.println("| " + taxpayer.getName() + "| $ |" + String.format("%.2f", tax) + "|");
			sum += tax;
		}
		sc.close();
		System.out.println();
		System.out.println("total " + String.format("%.2f", sum));

	}

}
