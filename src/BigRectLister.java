import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Rectangle(300, 250));
        list.add(new Rectangle(8, 2));
        list.add(new Rectangle(4, 2));
        list.add(new Rectangle(6, 3));
        list.add(new Rectangle(70, 20));
        list.add(new Rectangle(10, 11));
        list.add(new Rectangle(5, 5));
        list.add(new Rectangle(2, 2));
        list.add(new Rectangle(3, 2));
        list.add(new Rectangle(3, 10));

        System.out.println("Unfiltered rectangles:");
        for (Object ob : list) {
            Rectangle rect = (Rectangle) ob;
            System.out.println("Rectangle with width: "
                    + rect.width + ", height: "
                    + rect.height + ", perimeter: "
                    + (2 * (rect.width + rect.height)));
        }
        ArrayList<Object> filtered = Main.collectAll(list,
                new BigRectangleFilter());
        System.out.println("\nFiltered rectangles:");
        for (Object object : filtered) {
            Rectangle rectangle = (Rectangle) object;
            System.out.println("Rectangle with width: "
                    + rectangle.width + ", height: "
                    + rectangle.height + ", perimeter: "
                    + (2 * (rectangle.width + rectangle.height)));
        }
    }
}
