package pl._1024kb.task06.factory;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.model.Triangle;

public class TriangleFigure extends GeometryFactory {

    @Override
    public Figure createFigure() {
        return new Triangle(lengthA, lengthB, lengthC);
    }
}
