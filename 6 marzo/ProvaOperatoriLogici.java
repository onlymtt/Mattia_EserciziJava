public class ProvaOperatoriLogici {
    public static void main(String[] args) {
        int x = 4;
        System.out.println((x < 5 && x < 10));
        System.out.println((x < 5 || x < 4));
        System.out.println(!(x < 5 && x < 10));
    }
}
