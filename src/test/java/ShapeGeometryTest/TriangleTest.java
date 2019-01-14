package ShapeGeometryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl._1024kb.task06.model.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TriangleTest implements ShapeTest
{
    private Triangle triangle;

    @BeforeEach
    void setUp()
    {
        triangle = new Triangle(4, 6, 5);
    }

    @Test
    public void getAreaPositiveTest()
    {
        final double rightArea = 9.921567416492215;

        final double testingValue = triangle.getArea();

        assertEquals(testingValue, rightArea);
    }

    @Test
    public void getAreaNegativeTest()
    {
        final double wrongArea = 22.45630464364603533689950;

        final double testingValue = triangle.getArea();

        assertNotEquals(testingValue, wrongArea);
    }

    @Test
    public void getCircuitPositiveTest()
    {
        final double rightCircuit = 15.0;

        final double testingValue = triangle.getCircuit();

        assertEquals(testingValue, rightCircuit);
    }

    @Test
    public void getCircuitNegativeTest()
    {
        final double wrongCircuit = 33.36669;

        final double testingValue = triangle.getCircuit();

        assertNotEquals(testingValue, wrongCircuit);
    }
}
