
package com.mycompany.eva1_16_sobrecarga_2;


public class EVA1_16_SOBRECARGA_2 {

    public static void main(String[] args) {
        System.out.println("suma: "+suma(8,3));
        System.out.println("suma: "+suma(8.3,9.3));
        System.out.println("suma: "+suma("hola ","xd"));
    }
    //SUMA DE DOS NUMEROS  //suma(int,int)
    public static int suma(int valor1,int valor2){
      return valor1 + valor2;  
    }                    //suma(double,double)
    public static double suma(double valor1,double valor2){
      return valor1 + valor2;  
    }                    //suma(String,String)
    public static String suma(String valor1,String valor2){
      return valor1 + valor2;  
    }
    public static void suma(){
        System.out.println("Suma: sin argumentos");
    }
    
                      
}
