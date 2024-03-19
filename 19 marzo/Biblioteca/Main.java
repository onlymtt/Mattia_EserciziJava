import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo l'oggetto biblioteca
        Biblioteca biblioteca = new Biblioteca();
        //creo gli oggetti dei libri da inserire nella biblioteca
        Libro libro = new Libro("1984", 2, 4);
        Libro libro1 = new Libro("Harry Potter", 4, 3);

        biblioteca.setElencoLibri(libro);
        biblioteca.setElencoLibri(libro1);

        biblioteca.stampaLibriDisponibili();

        libro.prestaLibro();
        libro1.restituisciLibro();

        biblioteca.aggiungiLibro();
        biblioteca.rimuoviLibro(); 
        
    }
}
