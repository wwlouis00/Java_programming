class Book {
    int price;
    int num = 0;
    String title;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void print() {
        System.out.println("書　　名：" + title);
        System.out.println("定　　價：" + price);
        System.out.println("預約本數：" + num);
        System.out.println("金額合計：" + price * num);
    }
}

class Books {
    public static void main(String[] args) {
        Book book = new Book("Java的繪本", 1380);
        book.num = 10;
        book.print();
    }
}