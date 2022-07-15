class Drink {
    String name; // 商品名稱
    int price;   // 單價
    int count;   // 數量

    // 建構子
    Drink(String n, int p, int c) {
        name = n;
        price = p;
        count = c;
    }

    int getTotalPrice() { // 計算金額
        return count * price;
    }

    static void printTitle() {
        System.out.println("商品名稱\t\t單價\t數量\t金額");
    }

    void printData() {
        System.out.println(name + "\t" + price + "\t"
                    + count + "\t" + getTotalPrice());
    }
}

class Alcohol extends Drink {
    float alcper; // 酒精濃度

    // 建構子
    Alcohol(String n, int p, int c, float a) {
        super(n, p, c); // 呼叫父類別的建構子
        alcper = a;
    }



// 方法的覆寫
    static void printTitle() {
        System.out.println("商品名稱(濃度[%])\t單價\t數量\t金額");
    }

    // 方法的覆寫
    void printData() {
        System.out.println(name + "(" + alcper + ")" + "\t"
                    + price + "\t"+ count + "\t"+ getTotalPrice());
    }
}

class Payment {
    public static void main(String[] args) {
        Drink coffee = new Drink("咖啡", 200, 3);
        Drink oolongtea = new Drink("烏龍茶", 150, 2);
        Alcohol wine = new Alcohol("葡萄酒", 300, 2, 15.0f);

        Drink.printTitle();
        coffee.printData();
        oolongtea.printData();
        System.out.println();

        Alcohol.printTitle();
        wine.printData();
        int sum = coffee.getTotalPrice()
            + oolongtea.getTotalPrice() + wine.getTotalPrice();
        System.out.println("\n*** 總計金額" + sum + "日幣***");
    }
}
