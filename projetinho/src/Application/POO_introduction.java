package Application;
import java.util.Locale;
import java.util.Scanner;
import Application2.Rectangle;

public class POO_introduction {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("enter with width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.printf("area %.2f %n", rectangle.areaRectangle());
		System.out.printf("perimetro %.2f %n", rectangle.perimeter());
		System.out.printf("diagonal %.2f %n", rectangle.diagonal());
		sc.close();
	
		
	}

}
