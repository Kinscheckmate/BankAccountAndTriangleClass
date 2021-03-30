public abstract class Triangle {

    private double side;

    public Triangle(double s) {side = s; }

    public abstract double getPerimeter();

    public double getSide() {return side; }

    public abstract double getArea();

    public double getRatio()
    {return getArea() / getPerimeter(); }

}
