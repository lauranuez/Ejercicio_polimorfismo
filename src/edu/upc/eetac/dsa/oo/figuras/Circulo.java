package edu.upc.eetac.dsa.oo.figuras;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double r){
        radio=r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circulo con radio = " + radio + " y area: " + this.area() ;
    }
}
