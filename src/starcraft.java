import java.util.Scanner;

public class starcraft {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int n = input.nextInt();
		int saldo = 0;	
		
		for (int i = 0; i < n; i++) {
			int vitorias = input.nextInt();
			saldo = saldo + vitorias;
		}
		System.out.println(saldo);
		input.close();
		}
	}