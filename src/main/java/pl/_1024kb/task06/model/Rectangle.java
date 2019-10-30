package pl._1024kb.task06.model;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.exception.NotPositiveNumberException;
import pl._1024kb.task06.validator.LengthValidator;

public class Rectangle implements Figure
{
    private double lengthA;
    private double lengthB;


    public Rectangle(double lengthA, double lengthB)
    {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        try
        {
            LengthValidator.checkProperNumberValue(lengthA, lengthB);
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

