package ShapeGeometryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.factory.GeometryFactory;
import pl._1024kb.task06.factory.SquareFigure;


public class SquareTest implements ShapeTest
{
    private Figure square;

    @BeforeEach
    void setUp()
    {
        GeometryFactory geometryFactory = new SquareFigure();
        geometryFactory.setLengthA(4);
        square = geometryFactory.createFigure();
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
