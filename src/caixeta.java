import java.util.Scanner;
import java.util.Locale;

public class caixeta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]vet = new int[n];
		int iguais = 0;
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for (int i=0; i<n; i++) {
			if(vet[i] == x) {
				iguais++;
			}
		}
		System.out.println(iguais);
	}

}