import java.util.Scanner;

public class IllegalTriangle {

    public static void isValid(double side1, double side2, double side3) {
        boolean isValid = true;
        if (side1 <= 0 | side2 <= 0 | side3 <= 0)
            throw new ArithmeticException("Side must be greater than 0");
        else {
            if ((side1 + side2) <= side3 || (side2 + side3) <= side1 || (side1 + side3) <= side2)
                throw new ArithmeticException("total length of 2 sides must be greater than other side");
        }
    }

    public static void main(String[] args) {

        IllegalTriangle triangle = new IllegalTriangle();
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter 1st side: ");
            double side1 = input.nextDouble();
            System.out.print("Enter 2nd side: ");
            double side2 = input.nextDouble();
            System.out.print("Enter 3rd side: ");
            double side3 = input.nextDouble();
            triangle.isValid(side1, side2, side3);
        } catch (ArithmeticException e) {
            System.out.println("Triangle is not valid");
        }
    }
}
