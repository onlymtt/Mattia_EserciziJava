package Conversione;

import java.util.ArrayList;
import java.util.Scanner;

public class Conversione {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int resto;
		String binary;
		StringBuilder builder = new StringBuilder();
        System.out.print("Inserisci un numero decimale: ");
        int input = scanner.nextInt();
        
        
        do {
        resto = input % 2;
        
        input = input / 2;;
        
        builder.insert(0, resto);
        
        }while(input > 0);
        
        binary = builder.toString();
        System.out.println("Il binario è " + binary);
	}

}
