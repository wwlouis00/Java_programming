class Book {
    String title;
    String genre;

    void printBook() {
        System.out.println("�ѡ@�@�W�G" + title);
        System.out.println("���@�@���G" + genre);
    }
}

class Novel extends Book {
    String writer;

    void printNov() {
        printBook();
        System.out.println("�@�@�@�̡G" + writer);
    }
}

class Magazine extends Book {
    int day;

    void printMag() {
        printBook();
        System.out.println("�X����G" + day + "��");
    }
}

class Bookshelf {
    public static void main(String[] args) {
        Novel nov = new Novel();
        nov.title = "��´���j�_�I";
        nov.genre = "�_��";
        nov.writer = "Ank";
        Magazine mag = new Magazine();
        mag.title = "��ZJava��ø��";
        mag.genre = "�q��";
        mag.day = 20;
        nov.printNov();
        System.out.println();
        mag.printMag();
    }
}