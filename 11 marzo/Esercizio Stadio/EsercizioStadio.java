import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioStadio {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
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


        System.out.println("Scegli un'opzione: \n1.Incasso totale");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Incasso totale " + totIncasso);
                break;
        
            default:
                break;
        }
    }
}
