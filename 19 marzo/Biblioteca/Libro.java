import java.util.Scanner;

public class Libro {
    private String nome;
    private int copieDisponibili;
    private int copiePrestate;

    public Libro() {

    }

    //costruttore
    public Libro(String nome, int copieDisponibili, int copiePrestate) {
        this.nome = nome;
        this.copieDisponibili = copieDisponibili;
        this.copiePrestate = copiePrestate;
    }

    public String getNome() {
        return this.nome;
    }

    //metodo per prenotare un libro, riduce le copie disponibili e aumenta quelle prestate
    public void prestaLibro() {
        this.copieDisponibili--;
        this.copiePrestate++;
        System.out.println("Copie disponibili: " + copieDisponibili);
        System.out.println("Copie prestate: " + copiePrestate);
    }

    //metodo per restituire un libro, riduce le copie prestate e aumenta quelle disponibili
    public void restituisciLibro() {
        this.copieDisponibili++;
        this.copiePrestate--;
        System.out.println("Copie disponibili: " + copieDisponibili);
        System.out.println("Copie prestate: " + copiePrestate);
    }

    public int getCopieDisponibili() {
        return this.copieDisponibili;
    }
}
