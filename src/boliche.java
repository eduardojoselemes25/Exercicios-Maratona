import java.util.Scanner;
import java.util.Locale;

public class boliche {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int pinos = 0;
		for (int i=0; i<=n ;i++) {
			pinos+=i;
		}
		System.out.println(pinos);
	}

}
