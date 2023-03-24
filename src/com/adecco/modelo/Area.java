package com.adecco.modelo;
//Desde la clase Areas crear métodos para calcular el área de un círculo y un rectángulo y mostrarlos en pantalla
public class Area {

//    public String areaCirculo(float radio){
//        return "El área del círculo es " + 2*3.1416*radio;
//    }
    //si quiero poner el texto en el resultado, lo tengo que poner como tipo float y poner
    //la f en los números, en este caso en pi 3.1416f
    public float areaCirculo(float radio){
        return  3.1416f*radio*radio;
    }
    public String areaRectangulo (float lado, float altura){
        return "El área del rectángulo es: " + lado * altura;
    }
}
