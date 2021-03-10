package edu.upc.eetac.dsa.oo.figuras;

public class Rectangulo extends Figura{

    private double lado1;
    private double lado2;

    public Rectangulo(double l1, double l2)
    {
        lado1=l1;
        lado2 = l2;
    }

    public double area()
    {
        return lado1*lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


    public String toString(){
        return "Rectangulo con lado1: " + this.lado1 + " , lado 2: " + this.lado2 + " y area: " + this.area();
    }
}
