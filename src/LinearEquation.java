public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LinearEquation(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double distance(){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public double slope(){
        return (y2-y1)/(x2-x1);
    }
    public String slopeFraction(){
        double a = y2-y1;
        double b = x2-x1;
        String c = "";
        if (a < 0 && b < 0){
            c = Math.abs(a) + "/" + Math.abs(b);
        }else if (a < 0 || b < 0){
            c = "-" + Math.abs(a) + "/" + Math.abs(b);
        }else{
            c = Math.abs(a) + "/" + Math.abs(b);
        }
        return c;
    }
    public double yIntercept() {
        return y2 - (slope() * x2);
    }
    public String equation(){
        if (yIntercept() > 0){
            return "y = " + slopeFraction() + "x + " + yIntercept();
        }else{
            return "y = " + slopeFraction() + "x - " + Math.abs(yIntercept());
        }
    }
    public String lineInfo(){
        String points = "The two points are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        String equation = "The equation of the line between these two points is: " + equation();
        String slope = "The slope of the line is: " + slope();
        String intercept = "The y-intercept of the line is: " + yIntercept();
        String distance = "The distance between the two points is: " + distance();
        return points + "\n" + equation + "\n" + slope + "\n" + intercept + "\n" + distance + "\n";
    }
    public String coordinateForX(double x){
        double y = slope() * x + yIntercept();
        return "(" + x + ", " + y + ")";
    }
}