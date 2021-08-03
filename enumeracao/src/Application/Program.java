package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("enter with your name nsapokdaspi :");
		String name = sc.nextLine();

		System.out.println("enter with your email : ");
		String email = sc.next();

		System.out.println("enter whit your birthday (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order items :");
		System.out.println("Status :");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);
		
		
		System.out.println("how many items to this order ?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("enter " + i + "#data");

			System.out.println("product name :");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("product price :");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName,productPrice);
			
			System.out.println("quantity:");
			int quantity = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantity,productPrice, product);
			order.addItem(orderitem);////// Order - > recebe os itens adicioninado em order item////////

		}
		System.out.println();
		System.out.println("ORDERY SUMMARY");
		System.out.println(order);

		sc.close();

	}

}
