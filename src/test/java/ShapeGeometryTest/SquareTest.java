package ShapeGeometryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import pl._1024kb.task06.model.Shape;
import pl._1024kb.task06.model.Square;

public class SquareTest implements ShapeTest
{
    private Shape square;

    @BeforeEach
    void setUp()
    {
        square = new Square(4);
    }

    @Test
    public void getAreaPositiveTest()
    {
        final double rightArea = 16.0;

        final double testingValue = square.getArea();

        assertEquals(testingValue, rightArea);
    }

    @Test
    public void getAreaNegativeTest()
    {
        final double wrongArea = 12.45;

        final double testingValue = square.getArea();

        assertNotEquals(testingValue, wrongArea);
    }

    @Test
    public void getCircuitPositiveTest()
    {
        final double rightCircuit = 16.0;

        final double testingValue = square.getCircuit();

        assertEquals(testingValue, rightCircuit);
    }

    @Test
    public void getCircuitNegativeTest()
    {
        final double wrongCircuit = 23.31;

        final double testingValue = square.getCircuit();

        assertNotEquals(testingValue, wrongCircuit);
    }
}
