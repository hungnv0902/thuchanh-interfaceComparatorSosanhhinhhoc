import java.util.Arrays;
import java.util.Comparator;

public class TestRectangle{
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3 ,4);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle("red",false,7,8);

        System.out.println("Truoc");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

       Comparator rec = new RectangleComparator();

        Arrays.sort(rectangles, rec);

        System.out.println("sau");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

    }
}
