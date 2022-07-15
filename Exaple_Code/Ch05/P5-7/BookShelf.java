class Book {
    String title;
    String genre;

    void printBook() {
        System.out.println("書　　名：" + title);
        System.out.println("類　　型：" + genre);
    }
}

class Novel extends Book {
    String writer;

    void printNov() {
        printBook();
        System.out.println("作　　者：" + writer);
    }
}

class Magazine extends Book {
    int day;

    void printMag() {
        printBook();
        System.out.println("出版日：" + day + "日");
    }
}

class Bookshelf {
    public static void main(String[] args) {
        Novel nov = new Novel();
        nov.title = "詩織的大冒險";
        nov.genre = "奇幻";
        nov.writer = "Ank";
        Magazine mag = new Magazine();
        mag.title = "月刊Java的繪本";
        mag.genre = "電腦";
        mag.day = 20;
        nov.printNov();
        System.out.println();
        mag.printMag();
    }
}