package pl._1024kb.task06.model;

import pl._1024kb.task06.exception.NotPositiveNumberException;

public class Rhombus extends Square
{
    private double height;

    public Rhombus(double lengthA, double height)
    {
        super(lengthA);
        this.height = height;
        try
        {
            lengthValidator.checkProperNumberValue(height);
        } catch (NotPositiveNumberException e)
        {
            e.printStackTrace();
        }

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
