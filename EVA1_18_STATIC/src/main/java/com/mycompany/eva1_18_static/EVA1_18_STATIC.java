
package com.mycompany.eva1_18_static;


public class EVA1_18_STATIC {

    public static void main(String[] args) {
        Prueba nombre = new Prueba();
        nombre.mensaje();//se necesita crear un objeto para poder usarlo
        Prueba.mensajeEstatico();//se puede usar sin crear un objeto
        System.out.println("pi "+Math.PI);

    
    }
}
class Prueba{
    public void mensaje(){
        System.out.println("holaaa");
    }
    public static void mensajeEstatico(){
        System.out.println("hola(estatico)    ");
    }
}
class Otra{
    
}
