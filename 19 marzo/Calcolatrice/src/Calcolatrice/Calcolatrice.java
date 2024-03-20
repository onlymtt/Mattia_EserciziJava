package Calcolatrice;


import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero binario: ");
        String input = scanner.nextLine();

        int decimal = 0;
        int base = 1;

        // Conversione da binario a decimale
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        System.out.println("Il numero decimale corrispondente è: " + decimal);
	}

}
