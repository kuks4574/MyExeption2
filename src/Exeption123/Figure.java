package Exeption123;

import java.util.NoSuchElementException;

public class Figure {
double side1;
double side2;


    public Figure(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Figure() {
    }

    double getPerimeter() {
        System.out.println("Perimetr rectangle= ");
        return 2*(side1 + side2);
    }

    double getArea(){
        System.out.println("Area rectangle= ");
        return side1 * side2;
    }
}
class Rectangle extends Figure {

    public Rectangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    double getPerimeter() {
        if (side1 < 0 || side2 < 0)
        throw new NegativeArraySizeException ("Отрицательный размер стороны фигуры");
        else
            System.out.println("Perimetr rectangle: ");
        return 2*(side1 + side2);
    }

    @Override
    double getArea() {
        return super.getArea();
    }

}
class Square extends Figure {
    double a;
    double b;

    public Square(double side1, double side2) throws IllegalAccessException {
        a = side1;
        b = side2;
        if (a - b != 0)
            throw new IllegalAccessException("Эта Фигура не является квадратом!");
    }

    @Override
    double getArea() {
        return super.getArea();

    }
}

    class Demo {
        private static Object Rectangle;

        public static void main(String[] args) {

            try {
              Square square1 = new Square(12.1, 14.1);

            } catch (IllegalAccessException e) {
                System.out.println("Перехввачено исключение: " + e);
            }

            if (Rectangle == null)
            throw new NullPointerException("Прямоугольник не задан");

        }
    }
class Demo2 {
    public static void main(String[] args) throws NegativeArraySizeException {
        Rectangle rectangle = new Rectangle(-12, 14);
        System.out.println(rectangle.getPerimeter());

    }
}
