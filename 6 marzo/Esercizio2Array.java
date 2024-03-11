import java.util.Scanner;

// in base a un input dell utente, creiamo una condizione dove ci sono 3 case più un opzione se nessuno è giusto
public class Esercizio2Array {
    public static void main(String[] args) {
        
        
        Scanner myObj = new Scanner(System.in);
        //input dell'utente
        System.out.println("Inserisci numero: ");
        int num = myObj.nextInt();

        switch (num) {
            case 1:
              System.out.println("Corretto");
              break;
            case 2:
              System.out.println("Corretto");
              break;
            case 3:
              System.out.println("Corretto");
              break;
            default:
            System.out.println("Sbagliato");
        }

    }
}
