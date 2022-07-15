class Animal {
    String name;
    int age;

    void printPet() {
        System.out.println("�W�r�G" + name);
        System.out.println("�~�֡G" + age);
    }
}

class Cat extends Animal {
    String variety;

    void printPet() {
        super.printPet();
        System.out.println("�~�ءG" + variety);
    }
}

class Pet {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "��";
        cat.age = 5;
        cat.variety = "�i����";
        cat.printPet();
    }
}