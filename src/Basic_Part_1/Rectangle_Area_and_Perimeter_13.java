package Basic_Part_1;

public class Rectangle_Area_and_Perimeter_13 {
    public static void main(String[] args) {


        System.out.println("Rectangle Area = " + "5.6*8.5 =" + (5.6 * 8.5));
        System.out.println("Rectangle Perimeter  = " + "2*(5.6*8.5) =" + 2* (5.6 *8.5));
    }
}
 class Exercise13 {
    public static void main(String[] strings) {
        // Define constants for the width and height of the rectangle
        final double width = 5.6;
        final double height = 8.5;

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (height + width);

        // Calculate the area of the rectangle
        double area = width * height;

        // Print the calculated perimeter using placeholders for values
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // Print the calculated area using placeholders for values
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}
