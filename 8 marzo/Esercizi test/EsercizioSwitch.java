import java.util.Scanner;

public class EsercizioSwitch {
    public static void main(String[] args) {

        //uso la classe scanner per prendere l'input
        Scanner scint = new Scanner(System.in);

        //dichiaro la viaribile intera per salvare l'input dell'utente preso dallo scanner
        int input;

        //inizio del menù
        System.out.println("Inserisci un numero compreso tra 1 e 3");

        //salvo l'input dell'utente nella variabile input utilizzando nextInt() che è proprio per gli interi
        input = scint.nextInt();

        //switch con le varie opzioni a seconda del valore della variabile input
        switch (input) {
            case 1:
                System.out.println("\nHai inserito 1");
                break;

                case 2:
                System.out.println("\nHai inserito 2");
                break;

                case 3:
                System.out.println("\nHai inserito 3");
                break;

                //caso default per gestire un input al di fuori di quelli che richiedo
                default:
                System.out.println("Numero non valido");
                break;
        }
    }
}
