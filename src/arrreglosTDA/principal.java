/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrreglosTDA;

/**
 *
 * @author JOSE
 */
public class principal {
    public static void main(String[] args) {
        //crear arreglo de objetos
        String[]nombres={"jose","carlos","juan"};//se crea  un arreglo con los nombres
        int[]edades={10,20,30};// se crea un arreglo con las edades
        Persona[]personas=new Persona[3];// se crea el tipo de dato abstracto llamado personas
        crear(personas);// se crea el metodo personas
        System.out.println("personas:\n"+personaslistar(personas));//se  imprime el mensaje con los arreglos
        inicializar(personas,nombres,edades);// se crea el metodo inicializar con los nombres y edades
        System.out.println("personas:\n"+personaslistar(personas)); //se  imprime el mensaje con los arreglos
        incrementaredad(personas);// se crea el metodo incrementar edades de las personas 
        System.out.println("personas:\n"+personaslistar(personas));//se  imprime el mensaje con los arreglos
    }
        public static void incrementaredad(Persona[]personas){// se crea el metodo incrementar edad
            for(Persona Persona:personas)// se crea un for each de la variable persona
        Persona.setEdad(Persona.getEdad()+1);// se asigna y se obtiene la edad
    }
    public static void inicializar(Persona[]arreglo,String[]nombres,int[]edades){// se crea el metodo inicializarcon los nombres y edades
        int i=0;// se crea una variable para iterar
        for(Persona elemento:arreglo){// se crea un for each para el arreglo de persona 
            elemento.setNombre(nombres[i]);// se asigna nombres a la variable i
            elemento.setEdad(edades[i]);// se asigna edades a la variable i
            i++;// se incrementa los valores introducidos
        }
    }
    //listar instancias del arreglo personas
    public static String personaslistar(Persona[]arreglo){
        String resultado="";
        for(Persona Persona:arreglo)// se asigna un for each para el arreglo persona
            resultado+=Persona.toString()+"\n";// se obtiene el resultado mediante tostring
        return resultado;// se retorna el resultado
    }
    //crear personas para el arreglo de personas
        public static void crear(Persona[]personas){// se crea el metodo de crear personas
            for(int i=0; i<personas.length; i++)// se utiliza un for para el arreglo de personas 
                personas[i]=new Persona();// se le asigna a la variable i como persona y se indica que es igual a la variable persona
                        
        }
    }

