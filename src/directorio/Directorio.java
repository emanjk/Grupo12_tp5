
package directorio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import vistaDirectorio.Contacto;
import vistaDirectorio.DirectorioTelefonico;


public class Directorio {

   // "En el main, crear un Directorio, entre 4 y 5 Contactos, y probar todos los métodos entre A y E. "
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       //declaramos directorio, para acceder a su atributo mediante a sus metodos. 
       DirectorioTelefonico directorio = new  DirectorioTelefonico() ; 
       
       Contacto contacto1 = new Contacto(42334455,"Matias","Perez","San Luis","Pringles 1555") ;
       Contacto contacto2 = new Contacto(41667788,"Lucas","Gatica","Buenos Aires","Belgrano 434") ;
       Contacto contacto3 = new Contacto(43778899,"Emanuel","Vizcay","Villa Mercedes","Bolivar 354") ;
       Contacto contacto4 = new Contacto(39224455,"Pedro","Sanchez","San Luis","Caseros 2354") ;
       System.out.println("------------------------------------------");
       System.out.println("El directorio tiene guardado 4 contactos");
       System.out.println("------------------------------------------");
       
       
       
/*(A)agregarContacto(),que permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro. del teléfono la clave del mismo*/

    directorio.agregarContacto(2664112233L, contacto1); //'L' de Long
    directorio.agregarContacto(2664223399L, contacto2);
    directorio.agregarContacto(2658907755L, contacto3);
    directorio.agregarContacto(2658907788L, contacto4);     
        
    
    
/*(B) buscarContacto(), que en base al nro. de teléfono retorna el Contacto asociado al mismo.*/       
    
    try{
        System.out.println("BUSQUEDA CONTACTO, Ingrese un numero de telefono para buscar un contacto: ");
        Contacto busContacto ;
        Long telefono = leer.nextLong();
        leer.nextLine(); //limpiamos el buffer
        Contacto contacto ;
        contacto = directorio.buscarContacto(telefono);
        if(contacto != null)
            System.out.println("Contacto encontrado!"+ contacto);
        else
            System.out.println("No se encontro el contacto ");

    }catch(NumberFormatException nf){
        System.out.println("Por favor, ingrese un numero valido");

    }   

    System.out.println("--------------------------------------------------------------");

  
/*(C) buscarTeléfono(), que en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados a dicho apellido. */                 
    
    System.out.println("BUSQUEDA TELEFONOS, Ingrese un apellido a buscar en el directorio");
    String apellido = leer.nextLine();
    TreeSet <Long> numeros = new TreeSet(); //guardamos los telefonos si encontramos.
    numeros = directorio.buscarTelefono(apellido) ; 
    if(numeros.isEmpty())
        System.out.println("No se encontro el contacto");
    else{
        for(Long telefono: numeros){
            System.out.println("Numero de telefonos asociados al Apellido "+ apellido);
            System.out.println(telefono);
        }   
    }
  
    System.out.println("--------------------------------------------------------------");
    
    
/*(D) buscarContactos(), que en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad*/
        
    System.out.println("BUSQUEDA CONTACTOS, Ingrese el nombre de la ciudad:  ");
    String ciudad ;
    ciudad = leer.nextLine(); //ingresamos la Ciudad a buscar en el 'directorio'
    ArrayList <Contacto> contactosMismaCiudad = directorio.buscarContactos(ciudad);
    if(contactosMismaCiudad.isEmpty())
        System.out.println("No se encontro la ciudad");
    else{
        System.out.println("Contactos encontrados asociados a la ciudad "+ciudad);
        for(Contacto contacto: contactosMismaCiudad){
           System.out.println(contacto);
            
        }
    }    
      
 System.out.println("--------------------------------------------------------------");

 
/*(E) borrarContacto(), que en base al número de teléfono elimina el contacto del directorio.*/    
        
        try{
            System.out.println("ELIMINAR UN CONTACTO, ingrese un numero de telefono");
            Long telefono = leer.nextLong();
            if(directorio.eliminarContacto(telefono))   
                    System.out.println("El contacto con el numero "+telefono+ " ah sido eliminado");
            else
                    System.out.println("No se encontro el contacto");
        }catch(NumberFormatException nf){
            System.out.println("Por favor, ingrese un telefono valido ");
        
        }
          
    }
    
}
