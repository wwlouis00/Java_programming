class Animal {
    String name;
    int age;

    void printPet() {
        System.out.println("名字：" + name);
        System.out.println("年齡：" + age);
    }
}

class Cat extends Animal {
    String variety;

    void printPet() {
        super.printPet();
        System.out.println("品種：" + variety);
    }
}

class Pet {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "蘭";
        cat.age = 5;
        cat.variety = "波斯貓";
        cat.printPet();
    }
}