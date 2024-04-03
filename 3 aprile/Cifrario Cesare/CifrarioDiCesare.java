import java.util.Scanner;

public class CifrarioDiCesare {
    private static final String DIZIONARIO = "abcdefghijklmnopqrstuvwxyz0123456789"; //Questo è il dizionario che useremo

    public static void main(String[] args) {
        
        
        //l'utente inserisce da testiera: la modalità, la parola da criptare/decriptare e di quanto vuole shiftare

            String risultato = "";
            System.out.println("Scegli la modalità: 1. Criptare, 0. Decriptare");
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            int modalita = sc.nextInt();
            System.out.println("Inserisci la parola");
            String messaggio = sc1.nextLine();
            System.out.println("Di quanto vuoi shiftare?");
            int shift = sc.nextInt();
            
        

        if (modalita == 1) {
            risultato = cripta(messaggio,shift);
        } else if (modalita == 0) {
            risultato = decripta(messaggio,shift);
        } else {
            System.out.println("Modalità non valida. Usa 1 per Crittografia e 0 per decrittografia");
            return;
        }
        System.out.println("Risultato : " + risultato);
    }

    private static String cripta(String testo, int shift) {
        return trasforma(testo,shift);
    }

    private static String decripta(String testo, int shift) {
        return trasforma(testo,-shift);
    }

    public static String trasforma(String testo, int shift) {
        StringBuilder risultato = new StringBuilder();

        for (char carattere : testo.toCharArray()) {
            if(DIZIONARIO.indexOf(carattere) != -1) {
                int posizioneOriginale = DIZIONARIO.indexOf(carattere);
                int nuovaPosizione = (DIZIONARIO.length() + posizioneOriginale + shift ) % DIZIONARIO.length(); //Effetto supermario
                risultato.append(DIZIONARIO.charAt(nuovaPosizione));
            } else {
                risultato.append(carattere);
            }
        }
        return risultato.toString();
    }
    
}