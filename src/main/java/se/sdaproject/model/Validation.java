package se.sdaproject.model;

public class Validation {

    public static void valdiateColor(String color) {
        if (color.equals("red") || color.equals("blue")|| color.equals("green")) {
            return;
        }
        throw new IllegalArgumentException();
    }

}
