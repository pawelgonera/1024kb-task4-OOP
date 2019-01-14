package pl._1024kb.task06.model;

import pl._1024kb.task06.exception.IsNotTriangleException;
import pl._1024kb.task06.validator.TriangleValidator;

public class Triangle extends Rectangle
{
    private double lengthC;
    private TriangleValidator validator = TriangleValidator.getInstance();

    public Triangle(double lengthA, double lengthB, double lengthC)
    {
        super(lengthA, lengthB);
        this.lengthC = lengthC;
        checkLengthValid(lengthC);

        checkTriangleValid(lengthA, lengthB, lengthC);
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

        return halfCircuit*(halfCircuit - lengthA) * (halfCircuit - lengthB) * (halfCircuit - lengthC);
    }

    private void checkTriangleValid(double lengthA, double lengthB, double lengthC)
    {
        try
        {
            boolean isTriangle = validator.checkIsTriangle(lengthA, lengthB, lengthC);
            if(isTriangle)
                System.out.println("Można stworzyć trójkąt");

        } catch (IsNotTriangleException e) {
            e.printStackTrace();
        }
    }
}
