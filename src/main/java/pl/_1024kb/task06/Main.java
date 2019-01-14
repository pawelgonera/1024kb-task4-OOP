package pl._1024kb.task06;

import pl._1024kb.task06.model.*;

public class Main
{
    public static void main(String[] args)
    {
        Shape square = new Square(4.5);
        System.out.println("Pole kwadratu: " + square.getArea());
        System.out.println("Obwód kwadratu: " + square.getCircuit());
        System.out.println("**************************************");

        Shape rectangle = new Rectangle(3, 5);
        System.out.println("Pole prostokąta: " + rectangle.getArea());
        System.out.println("Obwód prostokąta: " + rectangle.getCircuit());
        System.out.println("**************************************");

        Shape triangle = new Triangle(4.5, 3, 2.5);
        System.out.println("Pole trójkąta: " + triangle.getArea());
        System.out.println("Obwód trójkąta: " + triangle.getCircuit());
        System.out.println("**************************************");

        Shape rhombus = new Rhombus(5, 3);
        System.out.println("Pole rombu: " + rhombus.getArea());
        System.out.println("Obwód rombu: " + rhombus.getCircuit());

    }
}
