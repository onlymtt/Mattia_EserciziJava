import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esercizio2ArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        boolean trovato = false;

        //polimorfismo?
        List<String> arrayList = new ArrayList<String>();
        String elem;

        //chiedo quanti elementi vuole inserire
        System.out.println("Ciao, quanti elementi vuoi inserire?");
        int num = scint.nextInt();

        //input utente
        if (num > 3 && num < 8) {
        //faccio scegliere gli elementi e li aggiungo alla lista
        System.out.println("Inserisci gli elementi\n");
        for (int i = 1; i <= num; i++) {
            elem = scanner.nextLine();
            arrayList.add(elem);
        }
        //stampa degli elementi
        System.out.println("\nStampo gli elementi della lista");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("\n" + arrayList.get(i));
        }

    } else {
        System.out.println("Devi inserire almeno 4 elementi e massimo 8");
    }

    //ricerca con input utente
    System.out.println("Cosa vuoi cercare?");
    elem = scanner.nextLine();

    for (int i = 0; i < arrayList.size(); i++) {
        if (elem.equals(arrayList.get(i))) {
            trovato = true;
        } 
    }

    //controllo che l'elemento cercato sia nella lista usando un flag
    if (trovato) {
        System.out.println(elem + " è presente nella lista");
    } else {
        System.out.println(elem + " non è presente nella lista!");
    }

    }
}
