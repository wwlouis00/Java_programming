class Person {
    private String name;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }
}

class Girl extends Person {
    void print() {
        System.out.println(getName() + "©f©f");
    }
}

class TestPerson {
    public static void main(String[] args) {
        Girl shiori = new Girl();
        shiori.setName("¸ÖÂ´");
        shiori.print();
    }
}