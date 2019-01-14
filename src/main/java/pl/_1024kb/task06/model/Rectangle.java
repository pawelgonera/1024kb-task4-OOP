package pl._1024kb.task06.model;

public class Rectangle extends Shape
{
    protected double lengthB;

    public Rectangle(double lengthA, double lengthB)
    {
        super(lengthA);
        this.lengthB = lengthB;
        checkLengthValid(lengthB);
    }

    @Override
    public double getArea()
    {
        return lengthA * lengthB;
    }

    @Override
    public double getCircuit()
    {
        return 2 * (lengthA + lengthB);
    }
}

