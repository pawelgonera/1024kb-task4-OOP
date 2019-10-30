package pl._1024kb.task06.model;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.exception.IsNotTriangleException;
import pl._1024kb.task06.exception.NotPositiveNumberException;
import pl._1024kb.task06.validator.LengthValidator;
import pl._1024kb.task06.validator.TriangleValidator;

public class Triangle implements Figure
{
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC)
    {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;

        try
        {
            LengthValidator.checkProperNumberValue(lengthA, lengthB, lengthC);

            if(checkTriangleValid(lengthA, lengthB, lengthC))
                System.out.println("Można stworzyć trójkat");

        }catch (IsNotTriangleException e)
        {
            throw new IsNotTriangleException("Nie można stworzyć trójkąta");
        } catch (NotPositiveNumberException e) {
            e.printStackTrace();
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
        return TriangleValidator.checkIsTriangle(lengthA, lengthB, lengthC);
    }
}
