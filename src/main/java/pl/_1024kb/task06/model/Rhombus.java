package pl._1024kb.task06.model;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.exception.NotPositiveNumberException;
import pl._1024kb.task06.validator.LengthValidator;

public class Rhombus implements Figure
{
    private double lengthA;
    private double height;

    public Rhombus(double lengthA, double height)
    {
        this.lengthA = lengthA;
        this.height = height;
        try
        {
            LengthValidator.checkProperNumberValue(lengthA, height);
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
