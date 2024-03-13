import java.util.Random;

public class Tablet extends DispositivoElettronico {
    private int punti;
    private int id = 0;

    public Tablet(int id) {
    Random random = new Random();
    this.punti = random.nextInt(101);
    this.id++;
    }

    //override del metodo avviaApplicazione
    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("L'applicazione " + nomeApp + " si sta avviando dal tablet");

    }

    //metodi getter
    public int getPunti() {
        return punti;
    }


    public int getId() {
        return id;
    }

    

    


}
