public class EsempioConcatenazione {
    public static void main(String[] args) {
        String nome = "Mattia ";
        String id = "abcd ";
        String password = "password";



        // String concatenata = nome.concat(id).concat(password);
        String concatenata = nome.concat(id.concat(password));
    

        System.out.println(concatenata);
    }
}