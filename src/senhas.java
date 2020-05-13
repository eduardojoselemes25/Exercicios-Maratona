import java.util.Scanner;
import java.util.Locale;

public class senhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 8294) {
			System.out.println("SENHA INCORRETA");
			x = sc.nextInt();
		}
		int y = sc.nextInt();
		while (y != 2071) {
			System.out.println("SENHA INCORRETA");
			y = sc.nextInt();
		}
		System.out.println("COFRE ABERTO");
	}

}
