import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

       int cond;
       Scanner sc = new Scanner(System.in);
       int inputMenù = sc.nextInt();
       DispositivoElettronico dispositivo = new DispositivoElettronico();
       Smartphone smartphone = new Smartphone();
       Tablet tablet = new Tablet(0);
       int count = 0;

       do {
        
       System.out.println("1. Avvia applicazione, 2. Esci");
       dispositivo.avviaApplicazione("Resoconto");
       smartphone.avviaApplicazione(dispositivo.getNomeApp());
       tablet.avviaApplicazione(dispositivo.getNomeApp());
       ResocontoDigitale resoconto = new ResocontoDigitale();
      //String nome = smartphone.getNomiUtente().get(count).toString();
      // resoconto.stampaResoconto(smartphone.getNomiUtente().get(count), smartphone.getPasswords().get(count), tablet.getPunti(), tablet.getId());
        count++;
    }while(inputMenù != 2);
}
}
