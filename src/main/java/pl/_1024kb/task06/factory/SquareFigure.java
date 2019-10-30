package pl._1024kb.task06.factory;

import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.model.Square;

public class SquareFigure extends GeometryFactory {

    @Override
    public Figure createFigure() {
        return new Square(lengthA);
    }
}
