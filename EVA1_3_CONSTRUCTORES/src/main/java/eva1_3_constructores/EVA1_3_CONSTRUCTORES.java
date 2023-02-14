package eva1_3_constructores;


public class EVA1_3_CONSTRUCTORES {

   
    public static void main(String[] args) {
     Cuenta cuenta1 = new Cuenta("100",1000,"saul piñon");{
        /*cuenta1.setnombreCliente("saul piñon");
        cuenta1.setsaldo(1200);
        cuenta1.setcuenta("22550380");*/
       
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getnombreCliente());
        System.out.println(cuenta1.getsaldo());
        System.out.println(cuenta1.getcuenta());
       
        Cuenta cuenta2 = new Cuenta("200",2000,"miguel herrera");
        
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getnombreCliente());
        System.out.println(cuenta2.getsaldo());
        System.out.println(cuenta2.getcuenta());
        
        Cuenta cuenta3 = new Cuenta("300",3000,"pablo");
                System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getnombreCliente());
        System.out.println(cuenta3.getsaldo());
        System.out.println(cuenta3.getcuenta());
        
     }
    }
}