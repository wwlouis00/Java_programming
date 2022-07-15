import static java.lang.Math.log;

class StaticImport {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("以" + a + "為底的" + b + "之對數=" + log(b) / log(a));
    }
}