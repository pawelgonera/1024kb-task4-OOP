package pl._1024kb.task06.factory;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.model.Rectangle;

public class RectangleFigure extends GeometryFactory {

    @Override
    public Figure createFigure() {
        return new Rectangle(lengthA, lengthB);
    }
}
