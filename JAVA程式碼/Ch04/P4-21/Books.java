class Book {
    int price;
    int num = 0;
    String title;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void print() {
        System.out.println("�ѡ@�@�W�G" + title);
        System.out.println("�w�@�@���G" + price);
        System.out.println("�w�����ơG" + num);
        System.out.println("���B�X�p�G" + price * num);
    }
}

class Books {
    public static void main(String[] args) {
        Book book = new Book("Java��ø��", 1380);
        book.num = 10;
        book.print();
    }
}