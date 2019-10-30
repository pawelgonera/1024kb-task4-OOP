package pl._1024kb.task06.validator;

import pl._1024kb.task06.exception.IsNotTriangleException;

public class TriangleValidator
{
    public static boolean checkIsTriangle(double lengthA, double lengthB, double lengthC) throws IsNotTriangleException
    {
        if(!isTwoLengthsMoreThanThird(lengthA, lengthB, lengthC))
            throw new IsNotTriangleException("Z podanych długości nie można stworzyć trójkąta");

        return true;
    }

    private static boolean isTwoLengthsMoreThanThird(double lengthA, double lengthB, double lengthC)
    {
        return lengthA + lengthB > lengthC && lengthA + lengthC > lengthB && lengthB + lengthC > lengthA;
    }
}
