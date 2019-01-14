package pl._1024kb.task06.model;

public class Square extends Shape
{
    public Square(double lengthA)
    {
        super(lengthA);
    }

    @Override
    public double getArea()
    {
        return Math.pow(lengthA, 2);
    }

    @Override
    public double getCircuit()
    {
        return 4 * lengthA;
    }
}
