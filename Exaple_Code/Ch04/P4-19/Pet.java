class Cat {
    String name;
    String place;
    int age;

    void setData(String n, String p, int a) {
        name = n;
        place = p;
        age = a;
    }

    void print() {
        System.out.println(place + "�G" + name + " " + age + " ��");
    }

    void print(String p, int a) {
        place = p;
        System.out.println(place + "�G�߫} " + a + " ���C");
    }

    void print(String variety) {
        System.out.println(place + "�G" + name + " "
                    + age + " ��" + variety);
    }
}

class Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.setData("ù��", "�ڮa", 10);
        cat2.setData("�p�p", "�F�~", 14);
        cat1.print("�V��");
        cat2.print();
        cat3.print("��|", 0);
    }
}