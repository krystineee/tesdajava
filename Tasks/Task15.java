public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle( null, 5);
        Rectangle rectangle = new Rectangle(null, 6, 4);

        System.out.println("Circle:");
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());
        System.out.println("\nRectangle:");
        System.out.printf("Area: %.1f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.1f%n", rectangle.calculatePerimeter());
    }   
}
