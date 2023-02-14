/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class Cuenta {
   
    private String nombreCliente;
    private double saldo;
    private String cuenta;
   

    
    //CONSTRUCTOR
    //REGLAS
    // MODIFICADOR DE ACCSESO, NOMBRE DE LA CLASE (ARGUMENTOS)
   public Cuenta(){ // constructor default
       cuenta = "";
       saldo = 0;
       nombreCliente = "----";
       
   }
   public Cuenta(String nombreCliente, double cant, String cuenta){
    nombreCliente = nombreCliente;
    saldo = cant;
    cuenta = cuenta;
}
   
    // metodos get y ser
    public String getnombreCliente(){
        return nombreCliente;
    }
    public double getsaldo(){
        return saldo;
    }
    public String getcuenta(){
        return cuenta;
    }
    public void setnombreCliente(String valor){
        nombreCliente = valor;
    }
    public void setsaldo(double valor){
        saldo = valor;
    }
    public void setcuenta(String valor){
        cuenta = valor;
    }
}