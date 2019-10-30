package pl._1024kb.task06.validator;

import pl._1024kb.task06.exception.NotPositiveNumberException;

public class LengthValidator
{
    public static void checkProperNumberValue(double... length) throws NotPositiveNumberException
    {
        if(!isPositiveNumber(length))
            throw new NotPositiveNumberException("Dlugość nie jest większa niż zero");

    }

    private static boolean isPositiveNumber(double... length)
    {
        boolean isPositive = false;
        for(int i = 0; i < length.length; i++)
        {
            isPositive = length[i] > 0;
        }

        return isPositive;
    }
}
