import java.util.ArrayList;
import java.util.Scanner;

public class Menù {
    

    public static void main(String[] args) {


     final ArrayList listaTipoPane = new ArrayList<>();
        listaTipoPane.add("semola");
        listaTipoPane.add("bianco");
        listaTipoPane.add("kamut");

        // String[] listaIngredienti = {"prosciutto", "formaggio", "salame"};

        ArrayList listaIngredienti = new ArrayList<>();
        listaIngredienti.add("prosciutto");
        listaIngredienti.add("formaggio");
        listaIngredienti.add("salame");


        double[] prezziPane = {1.5, 2.1, 3.2};
        double[] prezziIngredienti = {2.0, 0.6, 1.4};

        Scanner sc = new Scanner(System.in);
        String input, inputIngr;

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
           // piattoSpeciale = new PiattoSpeciale(input, "prosciutto",  );
           // System.out.println("La base del tuo panino è " + piattoSpeciale.getTipoPane() + " con " + piattoSpeciale.getIngrediente());
           // prezzoTotale = prezziPane[listaTipoPane.indexOf(input)] + 2.1;
          //  System.out.println("Il prezzo è " + prezzoTotale);
        } else {
            System.out.println("Questa base non è presente!");
        }

        //scelta ingrediente
        System.out.println("Scegli un ingrediente");
        
        for (int i = 0; i<listaIngredienti.size(); i++) {
            System.out.println(listaIngredienti.get(i));
            
        }
        inputIngr = sc.nextLine();
        if (listaIngredienti.contains(inputIngr)) {
            System.out.println("Hai scelto " + inputIngr);
        } else {
            System.out.println("Questo ingrediente non è nella lista");
        }
        //il calcolo del prezzo totale non è corretto
        prezzoTotale = listaTipoPane.indexOf(input) + listaIngredienti.indexOf(inputIngr);
        PiattoSpeciale piattoSpeciale = new PiattoSpeciale(input, inputIngr, prezzoTotale);
        
        System.out.println("La base del tuo panino è " + piattoSpeciale.getTipoPane() + " con " + piattoSpeciale.getIngrediente());
        System.out.println("Il tuo panino costa: " + piattoSpeciale.getTotPrezzo());
        
    }
}
