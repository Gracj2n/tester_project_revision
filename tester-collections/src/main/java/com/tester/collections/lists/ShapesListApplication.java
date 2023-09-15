package com.tester.collections.lists;

import com.tester.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {

    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();

        Square square1 = new Square(10);
        Square square2 = new Square(4);
        Square square3 = new Square(7);

        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);

        for (int i = 0; i < shapes.size(); i++) {
            Square square = shapes.get(i);
            if (square.getArea() > 20) {
                System.out.println(square + ", area: " + square.getArea());
            }
        }

        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}
