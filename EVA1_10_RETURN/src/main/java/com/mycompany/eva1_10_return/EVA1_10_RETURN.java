
package com.mycompany.eva1_10_return;

public class EVA1_10_RETURN {

    public static void main(String[] args) {
        square(2);//llamada a funcion pero sin procesar el resultado
        int resultado;
        resultado = square(3);//llamda funcion, almacenando el resultado
        System.out.println(resultado);
        System.out.println(square(5));//llamada funcion,enviando 
    }
    public static int square(int num){
       
        return num * num;
    }
}
