import java.util.Scanner;

public class EsercizioMatematica {
    public static void main(String[] args) {
        
        Scanner scint = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int input = 0;
        String inputStr;
        int tot;

        int x = 3;
        int y = 8;


            for (int i = 0; i >= 0;) {

                System.out.println("\nVuoi calcolare? ");
                inputStr = sc.nextLine();
                if (inputStr.equalsIgnoreCase("no")) {
                    System.out.println("Hai calcolato " + i + " volte");
                    break;
                } else if (inputStr.equalsIgnoreCase("sì")) {
                
                System.out.println("Digita 1 per la somma, 2 per la sottrazione, 3 per il prodotto, 4 per il quoziente, qualsiasi altro numero per uscire\n");
                input = scint.nextInt();

            switch (input) {
                case 1:
                    tot = x + y;
                    System.out.println("La somma vale: " + tot);
                    break;

                case 2:
                    tot = x - y;
                    System.out.println("La sottrazione vale: " + tot);
                    break;


                case 3:
                    tot = x * y;
                    System.out.println("Il prodotto vale: " + tot);
                    break;

                case 4:
                    tot = x / y;
                    System.out.println("Il quoziente vale: " + tot);
                    break;                    
            
                default:
                    break;
            }


            } i++;
            System.out.println("Hai calcolato " + i + " volte");
        }
            
            
        
        
    }
}
