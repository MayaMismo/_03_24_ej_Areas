package com.adecco.presentacion;

import com.adecco.modelo.Area;

public class Main {
    public static void main(String[] args) {
        //tenemos que generar un objeto para poder imprimir el resultado
        Area a1 = new Area();

        //Area a2 = new Area();

        //y aquí los mando llamar. No seria necesario crear dos objetos para llamar el resultado,
        //desperdiciamos espacio
        System.out.println("El área del círculo es: " +a1.areaCirculo(2f));
        System.out.println(a1.areaRectangulo(5f,6f));

    }
}