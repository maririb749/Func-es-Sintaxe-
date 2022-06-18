import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler três números inteiros e mostrar na tela o maior
		 * deles.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three nunbers:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// encontrando o maior dos três

		int higher = max(a, b, c);
		
		showResult(higher);

		sc.close();

	}
	// declarando a função

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;

		} else {
			aux = z;
		}
		return aux;

	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
