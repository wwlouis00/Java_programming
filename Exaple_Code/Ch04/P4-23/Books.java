class Book {
    String title;
    String writer;

    Book(String t, String w) {
        title = t;
        writer = w;
    }

    Book(Book copy) {
        title = copy.title;
        writer = copy.writer;
    }

    void print() {
        System.out.println("�ѡ@�@�W�G" + title);
        System.out.println("�@�@�@�̡G" + writer);
    }
}

class Books {
    public static void main(String[] args) {
        Book book1 = new Book("�Ѫ�ø��","Ank");
        book1.print();
        Book book2 = new Book(book1);
        book2.title = "Java��ø��";
        book2.print();
    }
}