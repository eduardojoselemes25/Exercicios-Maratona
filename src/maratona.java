import java.util.Locale;
import java.util.Scanner;

public class maratona {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

	int n = input.nextInt();
	int total = 0;
	String nome1 = "";
	
	for (int i = 0; i < n; i++) {
		
		String nome = input.next();
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		
		if ((v1 + v2) > total) {
			total = (v1 + v2);
			nome1 = nome;
		}		
	}
	System.out.println(nome1);
	System.out.println(total);
	}
}
