class Drink {
    String name; // �ӫ~�W��
    int price;   // ���
    int count;   // �ƶq

    // �غc�l
    Drink(String n, int p, int c) {
        name = n;
        price = p;
        count = c;
    }

    int getTotalPrice() { // �p����B
        return count * price;
    }

    static void printTitle() {
        System.out.println("�ӫ~�W��\t\t���\t�ƶq\t���B");
    }

    void printData() {
        System.out.println(name + "\t" + price + "\t"
                    + count + "\t" + getTotalPrice());
    }
}

class Alcohol extends Drink {
    float alcper; // �s��@��

    // �غc�l
    Alcohol(String n, int p, int c, float a) {
        super(n, p, c); // �I�s�����O���غc�l
        alcper = a;
    }



// ��k���мg
    static void printTitle() {
        System.out.println("�ӫ~�W��(�@��[%])\t���\t�ƶq\t���B");
    }

    // ��k���мg
    void printData() {
        System.out.println(name + "(" + alcper + ")" + "\t"
                    + price + "\t"+ count + "\t"+ getTotalPrice());
    }
}

class Payment {
    public static void main(String[] args) {
        Drink coffee = new Drink("�@��", 200, 3);
        Drink oolongtea = new Drink("�Q�s��", 150, 2);
        Alcohol wine = new Alcohol("����s", 300, 2, 15.0f);

        Drink.printTitle();
        coffee.printData();
        oolongtea.printData();
        System.out.println();

        Alcohol.printTitle();
        wine.printData();
        int sum = coffee.getTotalPrice()
            + oolongtea.getTotalPrice() + wine.getTotalPrice();
        System.out.println("\n*** �`�p���B" + sum + "���***");
    }
}
