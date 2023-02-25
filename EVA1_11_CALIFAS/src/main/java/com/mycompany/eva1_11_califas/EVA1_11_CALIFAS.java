/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_califas;

/**
 *
 * @author saulp
 */
public class EVA1_11_CALIFAS {

    public static void main(String[] args) {
       CALIF(92);
        System.out.println(CALIF(92));
    }
    public static String CALIF(int calificacion){
        String resultado = "";
        if (calificacion>91){
            resultado = "A";
        }else
            if (calificacion>81){
            resultado = "B";
            
        }else
        if (calificacion>71){
            resultado = "C";
            
        } else
        resultado = "D";
        return resultado;
    }

}
