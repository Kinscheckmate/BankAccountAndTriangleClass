public class Equalateral extends Triangle {

    public Equalateral(double s)
    {
        super(s);
    }

    public double getPerimeter()
    {
        return 3 * getSide();
    }

    public double getArea()
    {
        return Math.sqrt(3) / 4 * getSide() * getSide();
    }

    public String toString()
    {
        return "An equalateral triangle with sides length "+ getSide();
    }
}
