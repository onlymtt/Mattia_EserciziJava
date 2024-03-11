public class Conversione {

    public static void main(String[] args) {


        int a = 5;
        int b = 3;
        float c, d;

        c = a/b; // c adesso contiene il valore 1.0
        d = (float)a/b; // d assume il valore atteso 1.6666666
        System.out.println("c vale: " + c + "\nd vale: " + d);

    }

    
}
