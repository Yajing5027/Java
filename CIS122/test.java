package CIS122;

public class test {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        test(a,b);
        System.out.println(a + " " + b);
    }

    public static void test(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

    }
}



