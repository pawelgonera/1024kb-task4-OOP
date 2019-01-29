package pl._1024kb.task06.validator;

import pl._1024kb.task06.exception.IsNotTriangleException;

public class TriangleValidator
{
    private static TriangleValidator instance;

    private TriangleValidator()
    {
        if(instance != null)
            throw new IllegalStateException("Cannot create new instance, use getInstance");
    }

    public static TriangleValidator getInstance()
    {
        if(instance == null)
            instance = new TriangleValidator();

        return instance;
    }

    public boolean checkIsTriangle(double lengthA, double lengthB, double lengthC) throws IsNotTriangleException
    {
        if(!isTwoLengthsMoreThanThird(lengthA, lengthB, lengthC))
            throw new IsNotTriangleException("Z podanych długości nie można stworzyć trójkąta");

        return true;
    }

    private boolean isTwoLengthsMoreThanThird(double lengthA, double lengthB, double lengthC)
    {
        if(lengthA + lengthB > lengthC && lengthA + lengthC > lengthB && lengthB + lengthC > lengthA)
            return true;
        else
            return false;
    }
}
