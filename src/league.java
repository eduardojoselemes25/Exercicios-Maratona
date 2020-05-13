import java.util.Scanner;
import java.util.Locale;

public class league {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String tipo = sc.next();
		int v = sc.nextInt();
		int a = 0;
		int b = 0;
		while (!tipo.equals("F")) {
	
			if (tipo.equals("A")) {
				a+=v;
			} 
			else if (tipo.equals("B")) {
				b+=v;
			}
			
			tipo = sc.next();
			v = sc.nextInt();
		}
		System.out.println("TIME A MARCOU " + a + " PONTOS");
		System.out.println("TIME B MARCOU " + b + " PONTOS");
	}
}