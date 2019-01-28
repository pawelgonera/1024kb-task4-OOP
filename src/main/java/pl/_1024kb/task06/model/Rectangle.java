package pl._1024kb.task06.model;

import pl._1024kb.task06.exception.NotPositiveNumberException;

public class Rectangle extends Square
{
    protected double lengthB;

    public Rectangle(double lengthA, double lengthB)
    {
        super(lengthA);
        this.lengthB = lengthB;
        try
        {
            lengthValidator.checkProperNumberValue(lengthB);
        } catch (NotPositiveNumberException e)
        {
            e.printStackTrace();
        }
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

