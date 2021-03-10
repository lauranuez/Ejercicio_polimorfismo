package edu.upc.eetac.dsa.oo.figuras;

public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado){
        super(lado,lado);
    }

    @Override
    public String toString() {
        return "Cuadrado de lado: " + this.getLado1() + " y area: " + super.area();
    }
}
