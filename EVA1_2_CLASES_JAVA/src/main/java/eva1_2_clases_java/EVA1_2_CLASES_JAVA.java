/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        /*perso1.apellidos = "Piñon";
        perso1.nombre = "Saul";
        System.out.println(perso1.nombre+" "+perso1.apellidos);*/
        perso1.setNombre("Saul");
        perso1.setApellidos("piñon");
        perso1.setEdad(22);
        perso1.setGEnero('H');
        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getGenero());*/
        perso1.imprimirDatos();
        
        Persona perso2 = new Persona();
        perso2.setNombre("juanita");
        perso2.setApellidos("del barrio");
        perso2.setEdad(23);
        perso2.setGEnero('M');
        perso2.imprimirDatos();
        
        
    }
   
}