import java.util.Scanner;
import java.util.Locale;

public class reajuste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[]vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
        double x = sc.nextDouble();
		for (int i=0; i<N; i++) {
			vet[i] = (vet[i] + ((vet[i] * x) / 100));
		}
		for (int i=0; i<N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
	}

}