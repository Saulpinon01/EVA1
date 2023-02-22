
package com.mycompany.eva1_5_circulo;


public class circulo {
private double Radio;
private double Area;
private double Perimetro;
        
public circulo(double radio){
radio=radio;
Area=(3.1416)*(Math.pow(radio, 2));
Perimetro=2*(3.1416*radio);
    }
public double getRadio() {
return Radio;
    }
public void setRadio(double radio1) {
Radio = radio1;
    }
public double getArea() {
return Area;
    }
public double getPerimetro() {
return Perimetro;
    }
public circulo(){
Area = 0;
Perimetro = 0;
Radio = 0;       
}  
}
