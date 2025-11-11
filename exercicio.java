import java.util.Scanner;
import java.util.Locale;

public class exercicio {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int i = sc.nextInt();

		while (i != 4) {
			if (i == 1) {
				alcool += 1;
			} else if (i == 2) {
				gasolina += 1;
			} else if (i == 3) {
				diesel += 1;
			}

			i = sc.nextInt();
		}

		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}