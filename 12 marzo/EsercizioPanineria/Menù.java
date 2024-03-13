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
        Scanner scInt = new Scanner(System.in);
        String input, inputIngr;

        int prezziIndex = 0;
        double prezzoTotale = 0;

        int scelta;

        do {
        System.out.println("Menù");
        System.out.println("1. Prosegui, 2. Esci");
        scelta = scInt.nextInt();
        if (scelta == 1) {
        System.out.println("\nScegli un tipo di Pane");
        
        for (int i = 0; i<listaTipoPane.size(); i++) {
            System.out.println(listaTipoPane.get(i));
        }

        input = sc.nextLine();
        //scelta base panino
        if (listaTipoPane.contains(input)) {
            System.out.println("Hai scelto " + input);
           
        } else {
            System.out.println("Questa base non è presente!");
        }

        //scelta ingrediente
        System.out.println("\nScegli un ingrediente");
        
        for (int i = 0; i<listaIngredienti.size(); i++) {
            System.out.println(listaIngredienti.get(i));
        }
        inputIngr = sc.nextLine();
        if (listaIngredienti.contains(inputIngr)) {
            System.out.println("Hai scelto " + inputIngr);
        } else {
            System.out.println("Questo ingrediente non è nella lista");
        }

        //calcolo prezzo totale
        prezzoTotale = prezziPane[listaTipoPane.indexOf(input)] + prezziIngredienti[listaIngredienti.indexOf(inputIngr)];
        
        //listaTipoPane.indexOf(input) + listaIngredienti.indexOf(inputIngr);
        PiattoSpeciale piattoSpeciale = new PiattoSpeciale(input, inputIngr, prezzoTotale);
        
        System.out.println("\nLa base del tuo panino è " + piattoSpeciale.getTipoPane() + " con " + piattoSpeciale.getIngrediente());
        System.out.println("Il tuo panino costa " + piattoSpeciale.getTotPrezzo());
        }
        } while (scelta != 2);
    }
}
