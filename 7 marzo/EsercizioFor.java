import java.util.Scanner;

public class EsercizioFor {
    public static void main(String[] args) {
        String[] nomi = {"Mario", "Luigi", "Giovanni", "Andrea", "Antonio"};
        String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Neri", "Gialli"};

        Scanner scanner = new Scanner(System.in);

        // prendo l'input dell'utente
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();

        //ciclo l'array dei nomi per controllare se l'input è corretto
        for (int i = 0; i < nomi.length; i++) {
            if (nome.equals(nomi[i])) {
                System.out.println(nome + " è presente nella lista");
                break;
            } else {
                System.out.println("Questo nome non è presente nella lista");
                break;
            }
        }
        //ciclo l'array dei cognomi per controllare se l'input è corretto
        for (int i = 0; i < cognomi.length; i++) {
            if (cognome.equals(cognomi[i])) {
                System.out.println(cognome + " è presente nella lista");
                break;
            } else {
                System.out.println("Questo cognome non è presente nella lista");
                break;
            }
        }


    }
}
