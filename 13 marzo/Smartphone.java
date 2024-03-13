import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone extends DispositivoElettronico {

    private ArrayList<String> nomiUtente = new ArrayList<>();
    private ArrayList<String> passwords = new ArrayList<>();



  /*  public Smartphone(String nomeUtente, String password) {
        this.nomiUtente.add(nomeUtente);
        this.passwords.add(password);
    } */
    
    //Avvio applicazione
    @Override
    public void avviaApplicazione(String nomeApp) {
        
        System.out.println("L'applicazione " + nomeApp + " si sta avviando dallo smartphone");
        loginUtente();
    }

    //login
    private void loginUtente() {
        System.out.println("\nInserisci nome utente");
        Scanner sc = new Scanner(System.in);
        String inputNome = sc.nextLine();

        System.out.println("Inserisci la password");
        String inputPassword = sc.nextLine();
         this.nomiUtente.add(inputNome);
         this.passwords.add(inputPassword);
    }

    //metodi getter
    public ArrayList getNomiUtente() {
        return nomiUtente;
    }

    public ArrayList getPasswords() {
        return passwords;
    }

    
    
}
