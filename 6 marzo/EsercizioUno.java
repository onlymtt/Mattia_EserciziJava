import java.util.Scanner;

public class EsercizioUno {
    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in); 
    Scanner myObj2 = new Scanner(System.in);
    Scanner numeri = new Scanner(System.in);

    System.out.println("Inserisci nome: ");
    String nome = myObj.nextLine();  

    System.out.println("Inserisci nome: ");
    String cognome = myObj2.nextLine();

    System.out.println("Inserisci nome: ");
    int eta = numeri.nextInt();

    System.out.println("Nome: " + nome + ", cognome: " + cognome + ", età: " + eta);

    }
}
