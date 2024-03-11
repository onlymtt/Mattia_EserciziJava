import java.util.ArrayList;
import java.util.Random;

public class EsercizioStadio {
    public static void main(String[] args) {

        Random random = new Random();
        
        
        ArrayList<Integer> spettatoriSabato = new ArrayList<>();

        //Sabato
        for (int i = 0; i< 11; i++) {
            int numSpettatoriSabato = random.nextInt(10001);
            int incassoSabato = numSpettatoriSabato * 20;
            spettatoriSabato.add(numSpettatoriSabato);
        }
    }
}
