import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EsercizioStadio {

    Random random = new Random();
        
    int id = 0;
        
    ArrayList<Integer> spettatoriSabato = new ArrayList<>();
    ArrayList<Integer> spettatoriDomenica = new ArrayList<>();

    int numWeekEnd = random.nextInt(4)+1;

    int totIncasso = 0;

    int numSpettatoriSabato, numSpettatoriDomenica;
    
    //metodo per calcolare l'incasso
    public void calcolaIncasso() {
        for (int i = 0; i<= numWeekEnd; i++) {
            numSpettatoriSabato = random.nextInt(10001);
            numSpettatoriDomenica = random.nextInt(10001);

          /*spettatoriSabato.add(numSpettatoriSabato);
            spettatoriDomenica.add(numSpettatoriDomenica); */

            int incassoSabato = numSpettatoriSabato * 20;
            int incassoDomenica = numSpettatoriDomenica * 15;

            totIncasso +=incassoSabato + incassoDomenica;
            id = numSpettatoriSabato - 1;
        }
    }

    //metodo per riempire gli array degli spettatori nei weekend
    public void riempiWeekend() {
            spettatoriSabato.add(numSpettatoriSabato);
            spettatoriDomenica.add(numSpettatoriDomenica);
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        EsercizioStadio stadio = new EsercizioStadio();
        
        //Incasso Sabato e Domenica
        stadio.calcolaIncasso();

        //riempio gli array con gli spettatori dei vari weekend
        stadio.riempiWeekend();

        
        //Menù con le varie scelte
        do {
            
            System.out.println("\nScegli un'opzione: \n1. Incasso totale \n2. Minimo spettatori \n3. Massimo spettatori \n0. Per uscire");
            input = sc.nextInt();
    
            switch (input) {
                //Incassi totali
                case 1:

                    System.out.println("Incasso totale " + stadio.totIncasso);
                    break;

                case 2:
                    //minimo numero di spettatori
                    int minSpettatori = Collections.min(stadio.spettatoriSabato);
                    System.out.println("Il minimo degli spettatori del sabato è " + minSpettatori);
                    minSpettatori = Collections.min(stadio.spettatoriDomenica);
                    System.out.println("Il minimo degli spettatori della domenica è " + minSpettatori);
                    break;

                case 3:
                    //massimo numero di spettatori
                    int maxSpettatori = Collections.max(stadio.spettatoriSabato);
                    System.out.println("Il massimo degli spettatori del sabato è " + maxSpettatori);
                    maxSpettatori = Collections.max(stadio.spettatoriDomenica);
                    System.out.println("Il massimo degli spettatori della domenica è " + maxSpettatori);
                    break;
            
                default:
                    break;
        }
        
    }while(input != 0);
    }
}
