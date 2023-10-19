import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String a = scan.nextLine();
        double x1 = Double.parseDouble(a.substring(0,a.indexOf(",") + 1));
        double y1 = Double.parseDouble(a.substring(a.indexOf(","), a.length() + 1));
        System.out.println("Enter coordinate 2: ");
        String b = scan.nextLine();
        double x2 = Double.parseDouble(b.substring(0,a.indexOf(",") + 1));
        double y2 = Double.parseDouble(b.substring(a.indexOf(","), a.length() + 1));
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));

    }
}
