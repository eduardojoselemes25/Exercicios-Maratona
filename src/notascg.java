import java.util.Scanner;

public class notascg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		double nota1, nota2, nota3;
		double total;

		for (int i = 0; i < n; i++) {
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			total = nota1 + nota2 + nota3;

			System.out.printf("%.2f%n", total);

		}

		sc.close();

	}

	}

