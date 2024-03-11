import java.util.Scanner;

public class EsercizioIfElse {
    public static void main(String[] args) {

        String nome = "Mattia";
        String cognome = "Santitto";


        Scanner myObj = new Scanner(System.in); 
       // Scanner myObj2 = new Scanner(System.in);

        System.out.println("Inserisci username: ");
        String username = myObj.nextLine();  

        System.out.println("Inserisci password: ");
        String password = myObj.nextLine();

        if (nome.equals(username) && cognome.equals(password)) {
            System.out.println("\nBravo, hai vinto");
        } else {
            System.out.println("\nMale, tutto sbagliato\n");
        }

    myObj.close();
   // myObj2.close();

}

}
