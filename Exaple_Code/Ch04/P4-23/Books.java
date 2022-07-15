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
        System.out.println("書　　名：" + title);
        System.out.println("作　　者：" + writer);
    }
}

class Books {
    public static void main(String[] args) {
        Book book1 = new Book("Ｃ的繪本","Ank");
        book1.print();
        Book book2 = new Book(book1);
        book2.title = "Java的繪本";
        book2.print();
    }
}