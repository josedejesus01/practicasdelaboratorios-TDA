/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrreglosTDA;

//descripcion de las operaciones definidas
    // se crean los metodos getter y setter
public class Persona {
    private String nombre;
    private int edad;

     Persona() {
        nombre = "";
        edad = 0;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
   // se implemnta la redeficion de metodo
    @Override
    public String toString(){
        String resultado="";
        resultado+="nombre:"+nombre+"\n";
        resultado+="edad"+edad+"\n";
        return resultado;
                }
    
}
