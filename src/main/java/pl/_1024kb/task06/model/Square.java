package pl._1024kb.task06.model;

import pl._1024kb.task06.api.Shape;
import pl._1024kb.task06.exception.NotPositiveNumberException;
import pl._1024kb.task06.validator.LengthValidator;

public class Square implements Shape
{
    protected double lengthA;
    protected LengthValidator lengthValidator = LengthValidator.getInstance();

    public Square(double lengthA)
    {
        this.lengthA = lengthA;
        try
        {
            lengthValidator.checkProperNumberValue(lengthA);
        } catch (NotPositiveNumberException e)
        {
            e.printStackTrace();
        }
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
