public class Start {
    public static void main(String[] args) {
        boolean b1 = !(!(!(false ^ false) || (true && true)));
        int x = 3;
        int y = 2;
        boolean b2 = !((x * y) <= 6) && (x - y != 1);
        System.out.println(b1);
        System.out.println(b2);
    }
}
