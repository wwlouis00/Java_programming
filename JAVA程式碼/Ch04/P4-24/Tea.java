class Eat {
    void print1() {
        System.out.print(" E ");
    }

    void print2() {
        System.out.print(" A ");
    }

    void print3() {
        System.out.print(" T ");
    }
}

class Tea {
    public static void main(String[] args) {
        Eat eat = new Eat();
        eat.print3();
        eat.print1();
        eat.print2();
        System.out.println();
    }
}