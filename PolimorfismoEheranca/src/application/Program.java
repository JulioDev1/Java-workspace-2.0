package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("enter the number products");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("enter the name product:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("enter the price product:");
			int price = sc.nextInt();
			System.out.println("c-Common , u-used or i-imported ?");
			char op = sc.next().charAt(0);
			if (op == 'c') {
				list.add(new Product(name,price));
				
			}else if (op == 'i') {
					System.out.print("enter the Custom fe");
					double customFe = sc.nextDouble();

				list.add(new ImportedProduct(name,price,customFe));
				
			}else if (op == 'u') {
				System.out.println("data:");
				Date date =  sdf.parse(sc.next());
				
				
				list.add(new UsedProduct(name,price,date));
			}
			
			
		}
		System.out.println();
		for(Product product : list) {
			System.out.println(String.format("Order Product %s", product.priceTag()));
			
		}
		sc.close();

	}

}
