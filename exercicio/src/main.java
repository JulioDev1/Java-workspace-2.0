import java.util.Locale;
public class main {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office Desk";
		
		int idade = 30;
	    int code = 5290;
	    char gender = 'F';
	    
	    double preco1 = 2100.0;
	    double preco2 = 610.50;
		double measure = 53.234567;
		
		System.out.println("product:");
		System.out.printf("%s, cust %.2f%n",produto1, preco1);
		System.out.printf(" %s, cust %.2f%n",produto2, preco2);
        System.out.println();
        System.out.printf("the person has %d years and id is %d and your gender is %c%n", idade,code,gender);
        System.out.printf("measure : %.8f%n", measure);
        System.out.printf("measure : %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("measure : %.3f%n", measure);
        
        

	}

}
