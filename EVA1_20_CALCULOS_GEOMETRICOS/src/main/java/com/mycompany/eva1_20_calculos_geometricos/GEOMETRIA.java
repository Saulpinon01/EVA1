
package com.mycompany.eva1_20_calculos_geometricos;

public class GEOMETRIA {
    
    //constantes:
    public static double PI = 3.1416;
    //FINAL: UN SIGNIFICADO PARA CLASES Y OTRO PARA VARIABLES
    //SOLO SE PUEDE USAR EL VALOR UNA VEZ
    
    
    //PERIMETRO DE UN CIRCULO 
    public static final double calcularPerimetroCirculo(double radio){
        return PI *(radio*2);
    }    
    
    //AREA DE UN CIRCULO
    public static final double calcularArea(double radio){
        return PI*(radio*radio);
    }
    //VOLUMEN DE UNA ESFERA 
    public static final double calcularVolumen(double radio){
        return (4.0/3.0)*(PI*(radio*radio*radio));
    }
}
