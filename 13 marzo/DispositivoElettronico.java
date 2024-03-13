public class DispositivoElettronico {

    private String nomeApp;

    public void avviaApplicazione (String nomeApp) {
        this.nomeApp = nomeApp;
        System.out.println("L'applicazione " + nomeApp + "si sta avviando da un dispositivo generico" );
    }

    public String getNomeApp() {
        return nomeApp;
    }

    
}