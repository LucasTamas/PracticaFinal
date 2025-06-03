import java.util.Scanner;

public class GitHubPruebas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantos años tienes: ");
		int anos = entrada.nextInt();

		if (anos >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

	}

}
