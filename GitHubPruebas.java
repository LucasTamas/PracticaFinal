import java.util.Scanner;

public class GitHubPruebas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantos años tienes: ");
		int anos = entrada.nextInt();

		boolean esMayor = false;

		if (anos >= 18) {
			System.out.println("Eres mayor de edad");
		} else if (anos < 0){
			System.out.println("¿Tu eres tonto?");
		} else {
			System.out.println("Eres menor de edad");
			esMayor = false;
		}

		if (esMayor) {
			System.out.println("Puedes comprar cervezas");
		} else {
			System.out.println("No puedes comprar cervezas");
		}

	}

}
