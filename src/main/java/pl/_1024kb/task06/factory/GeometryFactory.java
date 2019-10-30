package pl._1024kb.task06.factory;

import pl._1024kb.task06.api.Figure;

public abstract class GeometryFactory {

    protected double lengthA;
    protected double lengthB;
    protected double lengthC;
    protected double height;

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract Figure createFigure();
}
