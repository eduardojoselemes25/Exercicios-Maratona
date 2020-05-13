import java.util.Scanner;
import java.util.Locale;

public class cofre {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int vogal = 0;
		String[] vet = new String[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.next();
			for (int j = 0; j < vet[i].length(); j++) {
				if (vet[i].charAt(j) == 'a') {
					vogal = vogal + 1;
				} else if (vet[i].charAt(j) == 'e') {
					vogal = vogal + 1;
				} else if (vet[i].charAt(j) == 'i') {
					vogal = vogal + 1;
				} else if (vet[i].charAt(j) == 'o') {
					vogal = vogal + 1;
				} else if (vet[i].charAt(j) == 'u') {
					vogal = vogal + 1;
				}
			}
			System.out.println(vogal);
			vogal = 0;
		}
	}
}
