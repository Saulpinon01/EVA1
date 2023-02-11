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
public class Persona {
//DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    // METODOS --> COMPORTAMIENTO DE LA CLASE
    // LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    // MODIFICADOR DE ACCESO, VALOR DE RETORNO, NOMBRE DEL METODO (ARGUMENTOS) (IMPLEMENTACION)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){//SET
        nombre = valor;
    }
    public int getEdad(){
    return edad;
}
    public void setEdad(int valor){
    edad = valor;
}
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String valor){
        apellidos = valor;
    }
    public char getGenero(){
        return genero;
    }
    public void setGEnero(char valor){
        genero = valor;
    }
    public void imprimirDatos(){
        System.out.println("nombre: "+nombre +" "+ apellidos);
        System.out.println("Edad: "+ edad);
        System.out.println("Genero: "+genero);
        switch (genero) {
            case 'H':
                System.out.println("hombre");
                break;
            case 'M':
                System.out.println("mujer");
                break;
            case 'L':
                System.out.println("Lesbiana");
                break;
            default:
                System.out.println("genero no registrado");
                break;
        }
            
    }
   
   
   
   
}