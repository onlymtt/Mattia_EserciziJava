import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Libro> elencoLibri = new ArrayList<>();

    public Biblioteca() {

    }

    public void setElencoLibri(Libro libro) {
        elencoLibri.add(libro);
    }

    public ArrayList getElencoLibri() {
        return this.elencoLibri;
    }

    public boolean getNomeLibro(String nomeLibro) {
        for (Libro libro : elencoLibri) {
            if (libro.getNome().equalsIgnoreCase(nomeLibro)) {
                return true;
            }
        }
        return false;
    }

    public void aggiungiLibro() {
        System.out.println("Aggiungi un libro");
        System.out.println("Come si chiama questo libro?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (getNomeLibro(input) == false) {

            System.out.println("Quante copie?");
            int input1 = sc.nextInt();
            // zero copie prestate perchè è appena stato aggiunto
            Libro libro = new Libro(input, input1, 0);
            this.elencoLibri.add(libro);
        } else {
            System.out.println("Libro già presente!");
        }

        stampaLibriDisponibili();

    }

    // metodo per rimuovere un libro dalla collezione
    public void rimuoviLibro() {
        System.out.println("Rimuovi un libro");
        System.out.println("Come si chiama il libro?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Iterator<Libro> iterator = elencoLibri.iterator();

       while (iterator.hasNext()) {
        Libro libroRimosso = iterator.next();
            if (getNomeLibro(input)) {
                iterator.remove();
            }
        }

        stampaLibriDisponibili();

    }

    // metodo per stampare tutta la lista di libri disponibili
    public void stampaLibriDisponibili() {
        System.out.println("I libri disponibili sono\n");
        for (Libro libro : elencoLibri) {
            System.out.println(libro.getNome() + ", copie:  " + libro.getCopieDisponibili());
        }
    }

}
