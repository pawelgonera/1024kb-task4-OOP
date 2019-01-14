package pl._1024kb.task06.model;

import pl._1024kb.task06.api.Geometry;
import pl._1024kb.task06.exception.NotPositiveNumberException;
import pl._1024kb.task06.validator.LengthValidator;

public abstract class Shape implements Geometry
{
    protected double lengthA;
    protected LengthValidator validator = LengthValidator.getInstance();

    public Shape(double lengthA)
    {
        this.lengthA = lengthA;
        checkLengthValid(lengthA);
    }

    public double getArea()
    {
        return 0;
    }

    public double getCircuit()
    {
        return 0;
    }

    protected void checkLengthValid(double length)
    {
        try
        {
            boolean isValid = validator.checkProperNumberValue(length);
            if(isValid)
                System.out.println(getClass().getSimpleName() + ": Liczba " + length + " jest większa od zera");

        } catch (NotPositiveNumberException e) {
            e.printStackTrace();
        }
    }
}
