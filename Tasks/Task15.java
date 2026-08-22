public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle(null, 0, 0, 5);
        Rectangle rectangle = new Rectangle(null, 6, 4);

        System.out.println("Circle:");
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimenter: %.2f%n", circle.calculatePerimeter());
        System.out.println("\nRectangle:");
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimenter: %.2f%n", rectangle.calculatePerimeter());
    }   
}
