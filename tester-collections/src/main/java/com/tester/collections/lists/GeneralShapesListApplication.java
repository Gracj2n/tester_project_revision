package com.tester.collections.lists;

import com.tester.collections.interfaces.Circle;
import com.tester.collections.interfaces.Shape;
import com.tester.collections.interfaces.Square;
import com.tester.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();

        shapes.add(new Triangle(5, 5, 5));
        shapes.add(new Square(8));
        shapes.add(new Circle(4));

        Shape kwadrat1 = new Square(5);
        Shape kwadrat2 = new Square(5);
        shapes.add(kwadrat1);
        shapes.add(kwadrat2);

        if (kwadrat1.equals(kwadrat2)) {
            shapes.remove(kwadrat2);
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Shape area: " + shape.getArea());
            System.out.println("Shape perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
