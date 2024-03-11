public class EsercizioSomma {
    public static void main(String[] args) {
                //dichiaro l'array di interi e la variabile somma 
                int[] array = {4, 2, 6, 1, 9};
                int somma = 0;
                //ciclo l'array e ad ogni ciclo sommo il valore corrente della somma al nuovo numero assegnandoli poi di nuovo alla variabile somma
                for (int i = 0; i<array.length; i++) {
                    somma += array[i];
                }
                //stampa finale della somma
                System.out.println(somma);
}

}
