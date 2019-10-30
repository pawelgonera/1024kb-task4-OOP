package ShapeGeometryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.factory.GeometryFactory;
import pl._1024kb.task06.factory.RectangleFigure;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest implements ShapeTest
{
    private Figure rectangle;

    @BeforeEach
    void setUp()
    {
        GeometryFactory geometryFactory = new RectangleFigure();
        geometryFactory.setLengthA(4);
        geometryFactory.setLengthB(3);
        rectangle = geometryFactory.createFigure();
    }

    @Test()
    public void getAreaPositiveTest()
    {
        final double rightArea = 12.0;

        final double testingValue = rectangle.getArea();

        assertEquals(testingValue, rightArea);
    }

    @Test
    public void getAreaNegativeTest()
    {
        final double wrongArea = 16.45;

        final double testingValue = rectangle.getArea();

        assertNotEquals(testingValue, wrongArea);
    }

    @Test
    public void getCircuitPositiveTest()
    {
        final double rightCircuit = 14.0;

        final double testingValue = rectangle.getCircuit();

        assertEquals(testingValue, rightCircuit);
    }

    @Test
    public void getCircuitNegativeTest()
    {
        final double wrongCircuit = 23.31;

        final double testingValue = rectangle.getCircuit();

        assertNotEquals(testingValue, wrongCircuit);
    }
}
