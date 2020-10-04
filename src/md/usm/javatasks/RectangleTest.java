package md.usm.javatasks;

import md.usm.javatasks.beans.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle();
            System.out.println("Rectangle 1: \n" + rectangle);

            rectangle.setLength(1.5);
            rectangle.setWidth(7.9);
            System.out.println("Rectangle 2: \n" + rectangle);

            rectangle = new Rectangle(2.0, 5.0);
            System.out.println("Rectangle 3: \n" + rectangle);

            rectangle.setLength(-1.5);
            rectangle.setWidth(7.9);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}