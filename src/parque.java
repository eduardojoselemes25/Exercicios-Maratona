import java.util.Scanner;
import java.util.Locale;

public class parque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[]vet = new double[N];
		int podemEntrar = 0;
		
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		double x = sc.nextDouble();
		for (int i=0; i<N; i++) {
			if(vet[i] >= x) {
				podemEntrar++;
			}
		}
		System.out.println(podemEntrar);
	}


	}
