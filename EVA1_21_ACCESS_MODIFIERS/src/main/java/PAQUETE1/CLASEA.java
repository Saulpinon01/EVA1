
package PAQUETE1;

import PAQUETE2.CLASEE;


public class CLASEA {
    public int publcA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        // TODAS ESTAS CLASES ESTAN EN PAQUETE 1
        // MISMO PAQUETE
        ClaseB objeto = new ClaseB();
        //objeto.publcB;
        //objeto.defaultB;
        
        CLASEC objetoc = new CLASEC();
        //objetoc.defaultC;
        //objetoc.publicC;
        
        ClaseD objetod = new ClaseD();
        //objetod.defaultD;
        //objetod.publicD;
        // todo lo que sea default es ahora invisible
        CLASEE objetoe = new CLASEE();
        //objetoe.publicE;
        
        //clase f es default por lo tanto no es visible desde la clase A
        //ClaseF objetof = new ClaseF();
        
        
        
    }
    
    
}
class ClaseB{
     public int publcB;
    int defaultB;
    private int privateB;
}