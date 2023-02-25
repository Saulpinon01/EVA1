/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_sobrecarga_areas;

/**
 *
 * @author saulp
 */
public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
    calculararea(8);
    calculararea(20,30);
    calculararea(20,36,43);
        System.out.println("area circulo :"+ calculararea(2.0));
        System.out.println("area triangulo :"+ calculararea(8.0,21.0));
        System.out.println("area trapecio :"+ calculararea(8.0,21.0,6.0));

    }
        public static double calculararea(double radio){
        return Math.PI*radio*radio;

    }
        public static double calculararea(double base,double altura){
        return base*altura/2;

    }
        public static double calculararea(double baseMayor,double altura,double baseMenor){
        return altura*baseMayor*baseMenor;

    }
        
}
