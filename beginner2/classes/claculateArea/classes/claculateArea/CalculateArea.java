package classes.claculateArea;

public class CalculateArea {

    private double length;
    private double width;

    // constructor method to CalculateArea class
    public CalculateArea() {
        length = 0;
        width = 0;
    }

    // constructor method to call setDimentions method
    public CalculateArea(double l, double w) {
        setDimentions(l, w);
    }

    // method to set the length and width
    public void setDimentions(double l, double w) {
        if (l >= 0) {
            length = l;
        } else {
            length = 0;
        }
        if (w >= 0) {
            width = w;
        } else {
            width = 0;
        }
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return (" length = " + length + " width = " + width + " area = " + area());
    }
}
