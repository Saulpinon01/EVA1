
package PAQUETE1;

import PAQUETE2.CLASEE;


public class CLASEC {
        public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        
        ClaseB objetob = new ClaseB();
           //objetob.defaultB;
           //objetob.publcB;
         CLASEE objetoe = new CLASEE();
         //bjetoe.publicE;
         
         //ESTA EN OTRO PAQUETE
         //Y ES DEFAULT, ES INVISIBLE
         //ClaseF objetof = new ClaseF();
           
    }
    
    
}
class ClaseD{
        public int publicD;
    int defaultD;
    private int privateD;
    
}
