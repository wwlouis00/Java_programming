// ��H���OFigure
abstract class Figure {
    abstract void area();   // ���n
    abstract void around(); // �P��

    void measure() {
        area();
        around();
        System.out.println();
    }
}

// ��H���O���l���OSquare
class Square extends Figure {
    double side;
    double height;

    Square(double s) { // �غc�l
        side = height = s;
    }

    Square(double s, double h) { // �غc�l���h��
        side = s;
        height = h;
    }

    void area() { // ��H��k���мg
        System.out.println("�|��Ϊ����n�G" + (side * height));
    }

    void around() { // ��H��k���мg
        System.out.println("�|��Ϊ��P���G" + (2 * (side + height)));
    }
}


// ��H���O���l���OCircle
class Circle extends Figure {
    final double pi = 3.14;
    double radius;

    Circle(double r) { // �غc�l
        radius = r;
    }

    void area() { // ��H��k���мg
        System.out.println("�ꭱ�n�G" + (radius * radius * pi));
    }

    void around() { // ��H��k���мg
        System.out.println("��P���G" + (2 * radius * pi));
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