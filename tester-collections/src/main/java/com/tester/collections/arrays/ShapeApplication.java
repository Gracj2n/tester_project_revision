package com.tester.collections.arrays;

import com.tester.collections.interfaces.Circle;
import com.tester.collections.interfaces.Shape;
import com.tester.collections.interfaces.Square;
import com.tester.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = drawShape();
        }
        for (Shape shape : shapes) {
            ShapeUtils.displayShapeInfo(shape);
        }
    }

    public static Shape drawShape() {
        int drawnShapeKind = RANDOM.nextInt(3);

        double a = getRandomSize();
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize();
            double c = getRandomSize();
            return new Triangle(a, b, c);
        }
    }

    private static double getRandomSize() {
        return RANDOM.nextDouble() * 100 + 1;
    }
}
