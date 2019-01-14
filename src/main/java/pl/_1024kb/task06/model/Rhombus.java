package pl._1024kb.task06.model;

public class Rhombus extends Shape
{
    private double height;

    public Rhombus(double lengthA, double height)
    {
        super(lengthA);
        this.height = height;
        checkLengthValid(height);
    }

    @Override
    public double getArea()
    {
        return lengthA * height;
    }

    @Override
    public double getCircuit()
    {
        return 4 * lengthA;
    }
}
