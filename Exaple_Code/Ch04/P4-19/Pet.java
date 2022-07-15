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
        System.out.println(place + "：" + name + " " + age + " 歲");
    }

    void print(String p, int a) {
        place = p;
        System.out.println(place + "：貓咪 " + a + " 隻。");
    }

    void print(String variety) {
        System.out.println(place + "：" + name + " "
                    + age + " 歲" + variety);
    }
}

class Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.setData("羅賓", "我家", 10);
        cat2.setData("小小", "鄰居", 14);
        cat1.print("混種");
        cat2.print();
        cat3.print("後院", 0);
    }
}