
public class TypePromotion {

    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // char c = a - b;
        // System.out.println((int) (b));
        // System.out.println((int) (a));
        // System.out.println(a);
        // System.out.println(b - a);
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);
    }
}
