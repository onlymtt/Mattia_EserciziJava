import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EsercizioArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        List<String> arrayList = new ArrayList<String>();
        String elem;

        System.out.println("Ciao, quanti elementi vuoi inserire?");
        int num = scint.nextInt();

        if (num > 3 && num < 8) {

        System.out.println("Inserisci gli elementi\n");
        for (int i = 1; i <= num; i++) {
            elem = scanner.nextLine();
            arrayList.add(elem);
        }

        System.out.println("\nStampo gli elementi della lista");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("\n" + arrayList.get(i));
        }

    } else {
        System.out.println("Devi inserire almeno 4 elementi e massimo 8");
    }

    }
}
