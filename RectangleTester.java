public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println(rect.toString());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Diagonal: " + rect.calculateDiagonal());
        System.out.println("Equal: " + rect.equals(rect));

        Rectangle rect2 = new Rectangle(0, 0);
        System.out.println(rect2.toString());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        System.out.println("Diagonal: " + rect2.calculateDiagonal());
        System.out.println("equal: " + rect.equals(rect2));
    }
}
