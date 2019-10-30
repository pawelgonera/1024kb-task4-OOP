package pl._1024kb.task06;


import pl._1024kb.task06.api.Figure;
import pl._1024kb.task06.factory.*;


public class Main
{
    public static void main(String[] args)
    {
        GeometryFactory figureFactory;

        figureFactory = new SquareFigure();
        figureFactory.setLengthA(4);
        Figure square = figureFactory.createFigure();
        System.out.println("Pole kwadratu: " + square.getArea());
        System.out.println("Obwód kwadratu: " + square.getCircuit());
        System.out.println("**************************************");

        figureFactory = new RectangleFigure();
        figureFactory.setLengthA(5);
        figureFactory.setLengthB(3);
        Figure rectangle = figureFactory.createFigure();
        System.out.println("Pole prostokąta: " + rectangle.getArea());
        System.out.println("Obwód prostokąta: " + rectangle.getCircuit());
        System.out.println("**************************************");

        figureFactory = new TriangleFigure();
        figureFactory.setLengthA(6);
        figureFactory.setLengthB(4);
        figureFactory.setLengthC(3);
        Figure triangle = figureFactory.createFigure();
        System.out.println("Pole trójkąta: " + triangle.getArea());
        System.out.println("Obwód trójkąta: " + triangle.getCircuit());
        System.out.println("**************************************");

        figureFactory = new RhombusFigure();
        figureFactory.setLengthA(5);
        figureFactory.setHeight(3);
        Figure rhombus = figureFactory.createFigure();
        System.out.println("Pole rombu: " + rhombus.getArea());
        System.out.println("Obwód rombu: " + rhombus.getCircuit());

    }
}
