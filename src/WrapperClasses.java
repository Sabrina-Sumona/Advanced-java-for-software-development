public class WrapperClasses {
    public static void main(String[] args) {
        char ch = 'S';
        Character cha = 'R';
        ch = cha;
        cha = ch;

        int n = 50;
        Integer num = n;

        Double m = 96.31;

        double mn = m;

        System.out.println(ch);
        System.out.println(cha);
        System.out.println(n);
        System.out.println(num);
        System.out.println(m);
        System.out.println(mn);

    }
}
