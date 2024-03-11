import java.util.Arrays;

public class EsempioSplit {

    public static void main(String[] args) {

        String str = "Hello World";
        // separa la stringa str in due stringhe diverse
        String[] words = str.split("\\s");
        System.out.println(Arrays.toString(words));

        int lunghezza = str.length();
        System.out.println("Lunghezza: " + lunghezza);
    }
    
    }

