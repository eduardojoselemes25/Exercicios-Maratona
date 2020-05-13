import java.util.Scanner;
import java.util.Locale;

public class velho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

				int N = sc.nextInt();
		int[] vet = new int[N];
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		
		for (int i=0; i<vet.length; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		int maiorIdade = idade[0];
		int posicaoMaioridade = 0;
		
		for (int i=0; i<vet.length; i++) {
			if (idade[i] > maiorIdade) {
			
				maiorIdade = idade[i];
				posicaoMaioridade = i;
				
			}
		}
          System.out.println("Pessoa mais velha: " + nome[posicaoMaioridade]);

		
		sc.close();
	}



	}


