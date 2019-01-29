package pl._1024kb.task06.model;

import pl._1024kb.task06.exception.IsNotTriangleException;
import pl._1024kb.task06.exception.NotPositiveNumberException;
import pl._1024kb.task06.validator.TriangleValidator;

public class Triangle extends Rectangle
{
    private double lengthC;
    private TriangleValidator triangleValidator = TriangleValidator.getInstance();

    public Triangle(double lengthA, double lengthB, double lengthC)
    {
        super(lengthA, lengthB);
        this.lengthC = lengthC;

        try
        {
            lengthValidator.checkProperNumberValue(lengthC);
        } catch (NotPositiveNumberException e)
        {
            e.printStackTrace();
        }

        try
        {
            if(checkTriangleValid(lengthA, lengthB, lengthC))
                System.out.println("Można stworzyć trójkat");

        }catch (IsNotTriangleException e)
        {
            throw new IsNotTriangleException("Nie można stworzyć trójkąta");
        }

    }

    @Override
    public double getArea()
    {
        return Math.sqrt(getHeronsPattern());
    }

    @Override
    public double getCircuit()
    {
        return lengthA + lengthB + lengthC;
    }

    private double getHeronsPattern()
    {
        double halfCircuit = getCircuit() / 2;

        return halfCircuit * (halfCircuit - lengthA) * (halfCircuit - lengthB) * (halfCircuit - lengthC);
    }

    private boolean checkTriangleValid(double lengthA, double lengthB, double lengthC) throws IsNotTriangleException
    {
        boolean isTriangle = triangleValidator.checkIsTriangle(lengthA, lengthB, lengthC);
        if (isTriangle)
            return true;
        else
            return false;
    }
}
