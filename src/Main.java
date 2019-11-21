import java.util.Scanner;

public class Main {
    // 1. Point(10)
    public static void main(String[] args) {
        // BONUS POINT(1)
        double[] widthArray = {4, 7, 12, 15, 20, 40, 60, 80};
        double[] heightArray = {4, 7, 12, 15, 30, 50, 90, 50};

        // 2. Point
            // 20x30
            System.out.println("The area is : " + calculateRectArea(20, 30) + "cm\u00B2.");

            // 40x50
            System.out.println("The area is : " + calculateRectArea(40, 50) + "cm\u00B2.");

        System.out.println("\n--- --- SQUARES --- ---\n");

        // 5.Point
            // 4x4
            System.out.println("The area is : " + squareArea(4) + "cm\u00B2.");
            System.out.println("The perimeter is : " + squarePerimeter(4) + "cm.");

            // 7x7
            System.out.println("The area is : " + squareArea(7) + "cm\u00B2.");
            System.out.println("The perimeter is : " + squarePerimeter(7) + "cm.");

            // 25x25
            System.out.println("The area is : " + squareArea(25) + "cm\u00B2.");
            System.out.println("The perimeter is : " + squarePerimeter(27) + "cm.");

            // 77x77
            System.out.println("The area is : " + squareArea(77) + "cm\u00B2.");
            System.out.println("The perimeter is : " + squarePerimeter(77) + "cm.");

        // BONUS POINT(1)
        System.out.println("\n--- --- FOR LOOP --- ---\n");
        for(int i = 0; i < widthArray.length; i ++) {
            System.out.println("\n--- --- --- --- ---\n");
            System.out.println("W:" + widthArray[i] + " H:" + heightArray[i]);
            System.out.println("The are is " + calculateRectArea(widthArray[i], heightArray[i]));
        }

        // BONUS POINT(2)
        Scanner sc = new Scanner(System.in);
            // GET WIDTH
            System.out.println("Enter width...");
            double w = sc.nextDouble();

            //GET HEIGHT
            System.out.println("Enter height...");
            double h = sc.nextDouble();

            // SHOW RESULTS
            System.out.println("The area is : " + calculateRectArea(w, h) + "cm\u00B2.");
    }

    // 3. Point
    public static double calculateRectArea(double w, double h) {
        System.out.println(w == h ? "Square" : "Rectangle");
        return w * h;
    }

    // 4. Point
    // AREA OF A SQUARE
    public static double squareArea(double w) {
        System.out.println("\n--- --- --- --- ---\n");
        return w*w;
    }

    // 4. Point
    // PERIMETER OF A SQUARE
    public static double squarePerimeter(double w) {
        System.out.println("\n--- --- --- --- ---\n");
        return w*4;
    }
}
