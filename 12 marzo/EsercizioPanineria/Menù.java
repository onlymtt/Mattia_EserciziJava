import java.util.ArrayList;
import java.util.Scanner;

public class Menù {
    

    public static void main(String[] args) {

        PiattoSpeciale piattoSpeciale;

      final ArrayList listaTipoPane = new ArrayList<>();
        listaTipoPane.add("semola");
        listaTipoPane.add("bianco");
        listaTipoPane.add("kamut");

        String[] listaIngredienti = {"prosciutto", "formaggio", "salame"};

        double[] prezziPane = {1.5, 2.1, 3.2};
        double[] prezziIngredienti = {2.0, 0.6, 1.4};

        Scanner sc = new Scanner(System.in);
        String input;

        int prezziIndex = 0;
        double prezzoTotale = 0;


        System.out.println("Menù");
        System.out.println("Scegli un tipo di Pane");
        
        for (int i = 0; i<listaTipoPane.size(); i++) {
            System.out.println(listaTipoPane.get(i));
            
        }

        input = sc.nextLine();
        //scelta base panino
        if (listaTipoPane.contains(input)) {
            System.out.println("Hai scelto " + input);
            piattoSpeciale = new PiattoSpeciale(input, "prosciutto");
            System.out.println("La base del tuo panino è " + piattoSpeciale.getTipoPane() + " con " + piattoSpeciale.getIngrediente());
            prezzoTotale = prezziPane[listaTipoPane.indexOf(input)] + 2.1;
            System.out.println("Il prezzo è " + prezzoTotale);
        } else {
            System.out.println("Questo ingrediente non è presente!");
        }


    }
}
