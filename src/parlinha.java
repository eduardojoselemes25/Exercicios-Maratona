import java.util.Scanner;
import java.util.Locale;

public class parlinha {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
int N = sc.nextInt();
		
		int[][] mat = new int [N][N]; 
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j]=sc.nextInt();
			}
		}

		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ((mat[i][j] % 2) == 0) {
					System.out.println(i + ": " + mat[i][j]);
				}
			}
		}
	}



	}


