// 抽象類別Figure
abstract class Figure {
    abstract void area();   // 面積
    abstract void around(); // 周長

    void measure() {
        area();
        around();
        System.out.println();
    }
}

// 抽象類別的子類別Square
class Square extends Figure {
    double side;
    double height;

    Square(double s) { // 建構子
        side = height = s;
    }

    Square(double s, double h) { // 建構子的多載
        side = s;
        height = h;
    }

    void area() { // 抽象方法的覆寫
        System.out.println("四邊形的面積：" + (side * height));
    }

    void around() { // 抽象方法的覆寫
        System.out.println("四邊形的周長：" + (2 * (side + height)));
    }
}


// 抽象類別的子類別Circle
class Circle extends Figure {
    final double pi = 3.14;
    double radius;

    Circle(double r) { // 建構子
        radius = r;
    }

    void area() { // 抽象方法的覆寫
        System.out.println("圓面積：" + (radius * radius * pi));
    }

    void around() { // 抽象方法的覆寫
        System.out.println("圓周長：" + (2 * radius * pi));
    }
}

class SizeFigure {
    public static void main(String[] args) {
        Figure fig1 = new Square(2.5);
        Figure fig2 = new Square(2.3, 3.7);
        Figure fig3 = new Circle(3.6);
        fig1.measure();
        fig2.measure();
        fig3.measure();
    }
}