package prob3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");
        String choice = scanner.nextLine();

        switch (choice) {
            case "C":
                System.out.println("Enter the Radius of the Circle");
                Circle circle = new Circle(scanner.nextDouble());
                System.out.println("The area of Circle is :" + circle.computeArea());
                break;
            case "R":
                System.out.println("Enter the width of the Rectangle ");
                double width = scanner.nextDouble();
                System.out.println("Enter the height of the Rectangle ");
                double height = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("The area of Rectangle is :" + rectangle.computeArea());
                break;
            case "T":
                System.out.println("Enter the base of the Triangle ");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle ");
                double heightT = scanner.nextDouble();
                Triangle triangle = new Triangle(base, heightT);
                System.out.println("The area of Triangle is :" + triangle.computeArea());
                break;
            default:
                System.out.println("Choose wisely!");
                break;

        }
        scanner.close();

    }
}
