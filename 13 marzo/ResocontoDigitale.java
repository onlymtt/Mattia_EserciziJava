public class ResocontoDigitale {
    

    public ResocontoDigitale() {
        
    }

    //metodo che stampa il resoconto dell'utente
    public void stampaResoconto(Smartphone smartphone, Tablet tablet, int count) {
        System.out.println("Resoconto Digitale:");
        System.out.println("Nome: " + smartphone.getNomiUtente().get(count));
        System.out.println("Password: " + smartphone.getPasswords().get(count));
        System.out.println("Punti: " + tablet.getPunti());
        System.out.println("ID: " + tablet.getId());
    }
}
