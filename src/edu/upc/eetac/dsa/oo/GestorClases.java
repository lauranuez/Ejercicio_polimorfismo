package edu.upc.eetac.dsa.oo;

import edu.upc.eetac.dsa.oo.figuras.*;

import java.util.Arrays;
import java.util.Comparator;

public class GestorClases {

    public static void ordenar(Figura[] v){
        Arrays.sort(v);
    }


    public static double sumaArea(Figura[] v){
        double total = 0;
        for (int i = 0; i< v.length; i++){
            Figura f = v[i];

            total = total + f.area();
        }

        return total;
    }

    public static void main(String[] args){

        Figura[] v = new Figura[4];

        v[0] = new Triangulo(5,8);
        v[1] = new Rectangulo(4,10);
        v[2] = new Circulo(3);
        v[3] = new Cuadrado(6);

        double r = GestorClases.sumaArea(v);

        System.out.println(Arrays.asList(v));
        GestorClases.ordenar(v);
        System.out.println(Arrays.asList(v));

    }




}
