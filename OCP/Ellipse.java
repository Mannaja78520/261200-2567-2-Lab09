package OCP;

public class Ellipse extends Shape {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis){
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * this.semiMajorAxis * this.semiMinorAxis;
    }
}
