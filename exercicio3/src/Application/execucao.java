package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Ficha;
public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Ficha ficha = new Ficha();
		
	    System.out.println("informe as tres notas dos alunos");
	    ficha.notaA = sc.nextDouble();
	    ficha.notaB = sc.nextDouble();
	    ficha.notaC = sc.nextDouble();
	    System.out.printf("final points %.2f",ficha.validatingNote());
	    
	    if (ficha.validatingNote()<60) {
	    	System.out.printf("the student necessites %.2f points %n", ficha.final_points());
	    } else {
	    	System.out.println("pass");
	    	
	    }

}
}
