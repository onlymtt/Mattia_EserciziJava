import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EsercizioStadio {

    
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int input;
        int id = 0;
        
        ArrayList<Integer> spettatoriSabato = new ArrayList<>();
        ArrayList<Integer> spettatoriDomenica = new ArrayList<>();

        int numWeekEnd = random.nextInt(4)+1;

        int totIncasso = 0;
        //Incasso Sabato
        for (int i = 0; i<= numWeekEnd; i++) {
            int numSpettatoriSabato = random.nextInt(10001);
            spettatoriSabato.add(numSpettatoriSabato);
            int incassoSabato = numSpettatoriSabato * 20;
            totIncasso +=incassoSabato;
            id = numSpettatoriSabato - 1;
        }

        //Incasso domenica
        for (int i = 0; i< numWeekEnd; i++) {
            int numSpettatoriDomenica = random.nextInt(10001);
            spettatoriDomenica.add(numSpettatoriDomenica);
            int incassoDomenica = numSpettatoriDomenica * 15;
            totIncasso +=incassoDomenica;
            id = numSpettatoriDomenica -1;
        }
        //Menù con le varie scelte
        do {
            System.out.println("\nScegli un'opzione: \n1. Incasso totale \n2. Minimo spettatori \n3. Massimo spettatori \n0. Per uscire");
            input = sc.nextInt();
    
            switch (input) {
                //Incassi totali
                case 1:

                    System.out.println("Incasso totale " + totIncasso);
                    break;

                case 2:
                    //minimo numero di spettatori
                    int minSpettatori = Collections.min(spettatoriSabato);
                    System.out.println("Il minimo degli spettatori del sabato è " + minSpettatori);
                    minSpettatori = Collections.min(spettatoriDomenica);
                    System.out.println("Il minimo degli spettatori della domenica è " + minSpettatori);
                    break;

                case 3:
                    //massimo numero di spettatori
                    int maxSpettatori = Collections.max(spettatoriSabato);
                    System.out.println("Il massimo degli spettatori del sabato è " + maxSpettatori);
                    maxSpettatori = Collections.max(spettatoriDomenica);
                    System.out.println("Il massimo degli spettatori della domenica è " + maxSpettatori);
                    break;
            
                default:
                    break;
        }
        
    }while(input != 0);
    }
}
