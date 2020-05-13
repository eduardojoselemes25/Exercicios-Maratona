import java.util.Scanner;
import java.util.Locale;

public class diag1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
          int N  = sc.nextInt();
		
		double[][] mat = new double[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		   double soma = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (j==i) {
					soma+=mat[i][j];
				}
			}
		}
		System.out.printf("Soma da diagonal: %.1f%n", soma);
	}
}


