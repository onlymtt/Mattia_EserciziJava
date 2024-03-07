import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pasticceria {
    public static void main(String[] args) {
        int mode = 0;
        String scelta;
        Scanner scint = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<String> basi = new ArrayList<String>();
        basi.add("Pan di spagna");
        basi.add("Biscotto");
        basi.add("Nutella");

        List<String> ripieni = new ArrayList<String>();
        ripieni.add("Crema pasticcera");
        ripieni.add("Marmellata");
        ripieni.add("Pistacchio");

        List<String> frutte = new ArrayList<String>();
        frutte.add("Fragole");
        frutte.add("Banane");
        frutte.add("Mele");

        List<String> decorazioni = new ArrayList<String>();
        decorazioni.add("Glassa al cioccolato");
        decorazioni.add("Glassa alla nutella");
        decorazioni.add("Zucchero a velo");

        
        List<String> dolce = new ArrayList<String>();

       do {
            System.out.println("Digita 1 per scegliere la modalità manuale, 2 per la scelta automatica, 3 per uscire");
            mode = scint.nextInt();
        if (mode == 1) {
            System.out.println("Scegli una base tra: Pan di spagna, Biscotto, Nutella");
            scelta = sc.nextLine();
            if (!(basi.contains(scelta))) {
                System.out.println("Questa base non è in lista!");
            } else {
                dolce.add(scelta);
            }

            System.out.println("Scegli un ripieno tra: Crema pasticcera, marmellata, pistacchio");
            scelta = sc.nextLine();
            if (!(ripieni.contains(scelta))) {
                System.out.println("Questo ripieno non è in lista!");
            } else {
                dolce.add(scelta);
            }

            System.out.println("Scegli un tipo di frutta tra: Fragole, banane, mele");
            scelta = sc.nextLine();
            if (!(frutte.contains(scelta))) {
                System.out.println("Questa frutta non è in lista!");
            } else {
                dolce.add(scelta);
            }

            System.out.println("Scegli una decorazione tra: Glassa al cioccolato, glassa alla nutella, zucchero a velo");
            scelta = sc.nextLine();
            if (!(decorazioni.contains(scelta))) {
                System.out.println("Questa base non è in lista!");
            } else {
                dolce.add(scelta);
            }

        }

        if (mode == 0) {
            Random rand = new Random();
            int numeroCasuale = rand.nextInt(3) + 1;
            System.out.println("\nSto componendo il tuo dolce");
            dolce.add(basi.get(numeroCasuale));
        }

        System.out.println("\nEcco gli ingredienti del tuo dolce:\n");
            for (int i = 0; i< dolce.size(); i++) {
                
                System.out.println(dolce.get(i));
            }

            System.out.println("\n\n");

        } while (mode != 3);

        

        
    }

    }
