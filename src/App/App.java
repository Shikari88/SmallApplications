package App;

import App.figures.Circle;
import App.figures.Rectangle;
import App.figures.Square;
import App.figures.Triangle;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Shape> shapes= new ArrayList<>();
        shapes.add(new Circle(1.2f));
        shapes.add(new Circle(2.4f));
        shapes.add(new Rectangle(2.0f, 3.0f));
        shapes.add(new Square(5.0f));
        shapes.add(new Triangle(10.8f, 5));

        for(Shape s: shapes) {
            System.out.println(s.toString());
            System.out.println(s.getArea());
            System.out.println("-------");
        }
    }
}
