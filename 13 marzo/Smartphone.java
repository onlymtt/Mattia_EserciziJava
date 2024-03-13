import java.util.Scanner;

public class Smartphone extends DispositivoElettronico {

    private String nomeUtente;
    private String password;



    public Smartphone(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
    }
    
    @Override
    public void avviaApplicazione(String nomeApp) {
        
        System.out.println("L'applicazione " + nomeApp + " si sta avviando dallo smartphone");
        loginUtente();
    }

    private void loginUtente() {
        System.out.println("\nInserisci nome utente");
        Scanner sc = new Scanner(System.in);
        String inputNome = sc.nextLine();

        System.out.println("Inserisci la password");
        String inputPassword = sc.nextLine();
         this.nomeUtente = inputNome; 
         this.password = inputPassword;

    }
    
}
