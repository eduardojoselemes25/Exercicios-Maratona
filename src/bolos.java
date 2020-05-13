import java.util.Locale;
import java.util.Scanner;

public class bolos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		int n = sc.nextInt();
		double saldo = 0;
		
		for (int i = 0; i < n; i++) {
		int quantidade = sc.nextInt();
			saldo = saldo + (quantidade * preco);
			
		}
		
		System.out.printf("%.2f%n", saldo);
		
		sc.close();	
		
	}

}
