package ShapeGeometryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl._1024kb.task06.model.Rhombus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RhombusTest implements ShapeTest
{
    private Rhombus rhombus;

    @BeforeEach
    void setUp()
    {
        rhombus = new Rhombus(4, 3);
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
