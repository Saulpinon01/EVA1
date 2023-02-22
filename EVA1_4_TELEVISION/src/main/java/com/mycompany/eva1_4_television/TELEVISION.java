
package com.mycompany.eva1_4_television;


public class TELEVISION {
    // atributos: estado
    private boolean power;
    private int volumen;
    private int canal;
    //metodos: comportamiento
    // constructor:
    public TELEVISION(){ //CONSTRUCTOR DEFAULT
        
    power = false; // apagado
    volumen = 10;
    canal = 2;
    
    }
    public void cambiarPower(){ //debe empezar con un verbo
        
    if(power == false){// apagado
        power = true;// encendemos la tv
        System.out.println("TELEVISION ENCENDIDA");
    }else{ power = false;
        System.out.println("TELEVISION APAGADA");
    
    }
    }
    public void subirVolumen(){
        if(power == true){
            if(volumen<100){
        volumen = volumen +5;
        System.out.println("VOLUMEN "+volumen);
            }
        }
    } 
        public void bajarVolumen(){
        if(power==true){
            if(volumen >0){
            volumen = volumen -5;
        System.out.println("VOLUMEN "+volumen);
            }
        }
        }
        public void cambiarCanal(){
            if(power == true){
            if(canal<5){
            canal = canal + 1;
                System.out.println("canal:"+canal);
            }else{
                canal = 1;
                System.out.println("canal:"+canal);
            }
            }
        }
            public void bajarCanal(){
            if(power == true){
            if(canal>0){
            canal = canal - 1;

            }else{
                canal = 5;
                
            }
            System.out.println("canal:"+canal);
            }
            }
                
        
}
