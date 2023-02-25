
package com.mycompany.eva1_6_automovil;

public class AUTOMOVIL {
    private String MARCA;
    private String MODELO;
    private String PLACAS;
    private int AÑO;
    private String DUEÑO;
    private int ADEUDO1=1500;
    private int ADEUDO2=2000;
    private int ADEUDO3=2500;
    private int ADEUDO4=3000;
    private int ADEUDO5=4000;
    
    public  AUTOMOVIL (int AÑO,String MARCA,String MODELO,String PLACAS,String DUEÑO){

        
        }
    public void pagarAutomovil(){
                                if(AÑO <2000){
            System.out.println("MODELO: "+MARCA+" MODELO: "+MODELO+"PLACAS: "+PLACAS+"DUEÑO: "+DUEÑO);
            System.out.println("ADEUDO A PAGAR.- "+ADEUDO1);
        }
        if(AÑO<2006){
            System.out.println("MODELO: "+MARCA+" MODELO: "+MODELO+"PLACAS: "+PLACAS+"DUEÑO: "+DUEÑO);
            System.out.println("ADEUDO A PAGAR.- "+ADEUDO2);
    }
        if (AÑO<2011) {
            System.out.println("MODELO: "+MARCA+" MODELO: "+MODELO+"PLACAS: "+PLACAS+"DUEÑO: "+DUEÑO);
            System.out.println("ADEUDO A PAGAR.- "+ADEUDO3);
            
        }
        if (AÑO<2017) {
            System.out.println("MODELO: "+MARCA+" MODELO: "+MODELO+"PLACAS: "+PLACAS+"DUEÑO: "+DUEÑO);
            System.out.println("ADEUDO A PAGAR.- "+ADEUDO4);
        }
        if (AÑO<2024) {
            System.out.println("MODELO: "+MARCA+" MODELO: "+MODELO+"PLACAS: "+PLACAS+"DUEÑO: "+DUEÑO);
            System.out.println("ADEUDO A PAGAR.- "+ADEUDO5);            
        }
        
        
    }
    public String getMARCA(){
            return MARCA; 
    }
    public String getMODELO(){
            return MODELO; 
    }
    public String getDUEÑO(){
            return DUEÑO; 
    }
    public String getPLACAS(){
            return PLACAS;       
    }
    public int getAÑO(){
            return AÑO;            
    }
    public void setMARCA(String marca){
        MARCA=marca;
    }
    public void setMODELO(String modelo){
        MODELO=modelo;
    }
    public void setPLACAS(String placas){
        PLACAS=placas;
    }
    public void setDUEÑO(String dueño){
        DUEÑO=dueño;
    }
    public void setAÑO(int año){
        AÑO=año;
    }
    public AUTOMOVIL(){
       
    }
    
}
