package ShapeGeometryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.factory.GeometryFactory;
import pl._1024kb.task06.factory.RhombusFigure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RhombusTest implements ShapeTest
{
    private Figure rhombus;

    @BeforeEach
    void setUp()
    {
        GeometryFactory geometryFactory = new RhombusFigure();
        geometryFactory.setLengthA(4);
        geometryFactory.setHeight(3);
        rhombus = geometryFactory.createFigure();
    }

    @Test
    public void getAreaPositiveTest()
    {
        final double rightArea = 12.0;

        final double testingValue = rhombus.getArea();

        assertEquals(testingValue, rightArea);
    }

    @Test
    public void getAreaNegativeTest()
    {
        final double wrongArea = 16.45;

        final double testingValue = rhombus.getArea();

        assertNotEquals(testingValue, wrongArea);
    }

    @Test
    public void getCircuitPositiveTest()
    {
        final double rightCircuit = 16.0;

        final double testingValue = rhombus.getCircuit();

        assertEquals(testingValue, rightCircuit);
    }

    @Test
    public void getCircuitNegativeTest()
    {
        final double wrongCircuit = 5.369;

        final double testingValue = rhombus.getCircuit();

        assertNotEquals(testingValue, wrongCircuit);
    }
}
