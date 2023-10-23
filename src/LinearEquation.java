public class LinearEquation {
    //Instance varibles
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    //Constructor
    public LinearEquation(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //returns distance
    public double distance(){
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        a = (int)(a * 100 + 0.5);
        a = a/100;
        return a;
    }
    //returns a unrounded slope for calculations in y-int
    public double slopeUnrounded() {
        return (y2 - y1) / (x2 - x1);
    }
    //returns a rounded slope for equation info
    public double slope(){
    double a = (y2-y1)/(x2-x1);
        if (a < 0){
            a = (int)(a * 100 - 0.5);
            a = a/100;
        } else{
            a = (int)(a * 100 + 0.5);
            a = a/100;
        }
        return a;
    }
    //returns a simplified slope if applicable and if not leaves it in fraction form
    public String slopeFraction(){
        double a = y2-y1;
        double b = x2-x1;
        String c = "";
        if ((a/b) == 1){
        c = "";
        } else if((a/b) == -1){
        c = "-";
        } else if(Math.abs(a) % Math.abs(b) == 0 && (a < 0 && b < 0)){
            c = (int)(a/b) + "";
        } else if (Math.abs(a) % Math.abs(b) == 0 && (a < 0 || b < 0)){
            c = "-" + (int)(Math.abs(a/b));
        } else if (Math.abs(a) % Math.abs(b) == 0){
            c = (int)(a/b) + "";
        } else if (a < 0 && b < 0 || a > 0 && b > 0){
            c = (int)(Math.abs(a)) + "/" + (int)(Math.abs(b));
        }else if (a < 0 || b < 0){
            c = "-" + (int)(Math.abs(a)) + "/" + (int)(Math.abs(b));
        }
        return c;
    }
    //returns rounded y-int
    public double yIntercept() {
        double a = y2 - (slopeUnrounded() * x2);
        if (a < 0){
            a = (int)(a * 100 - 0.5);
            a = a/100;
        } else if (a > 0){
            a = (int)(a * 100 + 0.5);
            a = a/100;
        }else{
            a = 0;
        }
        return a;
    }
    //returns equation in correct form depending on slope and y-int
    public String equation(){
        String a = "";
        if (slopeUnrounded() == 0){
            a = "y = " + (int)(yIntercept());
        } else if (yIntercept() > 0){
            a = "y = " + slopeFraction() + "x + " + yIntercept();
        }else if(yIntercept() < 0){
            a = "y = " + slopeFraction() + "x - " + Math.abs(yIntercept());
        }else if(yIntercept() == 0){
            a = "y = " + slopeFraction() + "x";
        }
        return a;
    }
    //returns string with the equations info
    public String lineInfo(){
        String points = "The two points are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        String equation = "The equation of the line between these two points is: " + equation();
        String slope = "The slope of the line is: " + slope();
        String intercept = "The y-intercept of the line is: " + yIntercept();
        String distance = "The distance between the two points is: " + distance();
        return points + "\n" + equation + "\n" + slope + "\n" + intercept + "\n" + distance + "\n";
    }
    //returns coordinates containing given x-value
    public String coordinateForX(double x){
        double y = slope() * x + yIntercept();
        return "(" + x + ", " + y + ")";
    }
}