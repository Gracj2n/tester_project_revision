package com.tester.colorSelection;

import java.util.Scanner;

public class ColorSelection {
    public static String selectColor() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Select color (Y - yellow, P - pink, B - blue, R - red):");
            String selectedColor = scanner.nextLine().trim().toUpperCase();
            switch (selectedColor) {
                case "Y":
                    return "Yellow";
                case "P":
                    return "Ping";
                case "B":
                    return "Blue";
                case "R":
                    return "Red";
                default:
                    return "Wrong selection.";
            }
    }

    public static void main(String[] args) {
        String result = ColorSelection.selectColor();
        System.out.println(result);
    }
}
