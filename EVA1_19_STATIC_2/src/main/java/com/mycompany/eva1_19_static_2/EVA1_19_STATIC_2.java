/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_static_2;

/**
 *
 * @author saulp
 */
public class EVA1_19_STATIC_2 {
int x = 10;
    public static void main(String[] args) {
       //mensajeNoEstatico();
        //System.out.println(x);
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        mensajeEstatico();
    }
    public void mensajeNoEstatico(){// no exisiste 
        System.out.println("mensaje no estatico");
    }
    public static void mensajeEstatico(){// EXISTE AL INCICIAR EL PROGRAMA
        System.out.println("mensaje no estatico");
    }
}
