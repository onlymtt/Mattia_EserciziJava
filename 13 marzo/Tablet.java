import java.util.Random;

public class Tablet extends DispositivoElettronico {
    private int punti;
    private static int ultimoId = 0;
    private int id;

    public Tablet() {
    
    }

    //override del metodo avviaApplicazione
    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("L'applicazione " + nomeApp + " si sta avviando dal tablet");
        Random random = new Random();
        this.punti = random.nextInt(101);
        ultimoId++;
        this.id = ultimoId;

    }

    //metodi getter
    public int getPunti() {
        return punti;
    }


    public int getId() {
        return id;
    }

    

    


}
