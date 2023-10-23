import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Parse for coordinates
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String a = scan.nextLine();
        double x1 = Double.parseDouble(a.substring(1,a.indexOf(",")));
        double y1 = Double.parseDouble(a.substring(a.indexOf(",") + 1, a.length() - 1));
        System.out.println("Enter coordinate 2: ");
        String b = scan.nextLine();
        double x2 = Double.parseDouble(b.substring(1,b.indexOf(",")));
        double y2 = Double.parseDouble(b.substring(b.indexOf(",") + 1, b.length() - 1));
        //Constructor
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        //Utilizes Method
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        System.out.println("Coordinate for x: ");
        double x = scan.nextDouble();
        System.out.println("The point on 1,the line is" + equation.coordinateForX(x));

    }
}