import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioStadio {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int input;
        
        ArrayList<Integer> spettatoriSabato = new ArrayList<>();
        ArrayList<Integer> spettatoriDomenica = new ArrayList<>();

        int totIncasso = 0;
        //Incasso Sabato
        for (int i = 0; i< 11; i++) {
            int numSpettatoriSabato = random.nextInt(10001);
            spettatoriSabato.add(numSpettatoriSabato);
            int incassoSabato = numSpettatoriSabato * 20;
            totIncasso +=incassoSabato;
        }

        //Incasso domenica
        for (int i = 0; i< 11; i++) {
            int numSpettatoriDomenica = random.nextInt(10001);
            spettatoriDomenica.add(numSpettatoriDomenica);
            int incassoDomenica = numSpettatoriDomenica * 15;
            totIncasso +=incassoDomenica;
        }

        do {
            System.out.println("Scegli un'opzione: \n1. Incasso totale \n2. Minimo spettatori \n3. Massimo spettatori");
            input = sc.nextInt();
    
            switch (input) {
                case 1:
                    System.out.println("Incasso totale " + totIncasso);
                    break;

                case 2:
                    System.out.println("Il minimo degli spettaori di sabato è: " + spettatoriSabato);
                    break;
            
                default:
                    break;
        }
        
    }while(input != 0);
    }
}
