package edu.upc.eetac.dsa.oo.figuras;

public class Triangulo extends Figura{

    double base;
    double altura;

    public Triangulo(double b, double a){
        base=b;
        altura=a;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo con base= " + base + ", altura=" + altura + "y area: " + area();
    }
}
