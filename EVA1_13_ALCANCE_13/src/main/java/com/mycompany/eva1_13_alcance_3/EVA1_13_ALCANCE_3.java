/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_alcance_3;

/**
 *
 * @author saulp
 */
public class EVA1_13_ALCANCE_3 {

    public static void main(String[] args) {
       int x = 100;// VISIBLE EN TODO EL MAIN
        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            int x = 100;// NO SE PUEDE PORQUE YA ESTA DECLARADA EN EL MAIN
            System.out.println(x);//VISIBLE EN TODO EL MAIN 
            System.out.println(i);
            if (i == 5) {
                System.out.println(x);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
  public static void Algo(int x){

}
public static void Algo2(int x){

}  
    
}
