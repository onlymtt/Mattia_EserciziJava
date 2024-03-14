import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
       int cond;
       Scanner sc = new Scanner(System.in);
       int inputMenu;
       DispositivoElettronico dispositivo = new DispositivoElettronico();
       Smartphone smartphone = new Smartphone();
       Tablet tablet = new Tablet(0);
       int count = 0;
        //stampa di prova per debug
       System.out.println("Prova");
       do {
        //inizio menù
       System.out.println("1. Avvia applicazione, 2. Esci");
       inputMenu = sc.nextInt();
       dispositivo.avviaApplicazione("Resoconto");
       smartphone.avviaApplicazione(dispositivo.getNomeApp());
       tablet.avviaApplicazione(dispositivo.getNomeApp());
       ResocontoDigitale resoconto = new ResocontoDigitale();
      //String nome = smartphone.getNomiUtente().get(count).toString();
      resoconto.stampaResoconto(smartphone, tablet, count);
        count++;
    }while(inputMenu != 2);
}
}
