
package vistaDirectorio;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;




public class DirectorioTelefonico {
    public static TreeMap <Long, Contacto> directorio  = new TreeMap <>() ;

    public DirectorioTelefonico() {
    }

  
    //(1)Agregar Contacto 
    public void agregarContacto (Long num, Contacto contacto){
        directorio.put(num, contacto);
     
    }
    
    
    //(2)Buscar Contacto por numero de telefono TERMINAR, EN LA INTERFACE
    public Contacto buscarContacto(Long num){
        Contacto contacto = directorio.get(num);
        return contacto; // Si no encuentra el contacto, automaticamente retorna 'null'        
    }
    
    
    //(3)Buscar telefono por Apellido
    public TreeSet<Long> buscarTelefono(String apellido){
        TreeSet<Long> numTelefonos = new TreeSet();
        /*iteramos en el TreeMap*/
        for(Map.Entry<Long,Contacto> entry: directorio.entrySet()){
            Contacto contacto= entry.getValue(); //entro al 'valor' que es un Contacto.
            if(contacto.getApellido().equals(apellido))
                numTelefonos.add(entry.getKey()); //si encuentra el apellido, guardo el numero en el Set.
        }
     
        return numTelefonos; //puede retornar un TreeSet vacio si no encuentra el apellido.
        }
    
    
    //(4)Buscar contactos por Ciudad
    public ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList soloContactos = new ArrayList (); //Aqui se guardara los contactos que encontremos.
        
        for(Map.Entry<Long,Contacto> entry: directorio.entrySet()){
            Contacto contactoEncontrado = entry.getValue();
            
            
            if (contactoEncontrado.getCiudad().trim().equalsIgnoreCase(ciudad.trim())) {
                soloContactos.add(contactoEncontrado);
            }
        }
    
        return soloContactos; //puede retornar un ArrayList vacio si no encontro la ciudad
    }
    
    
    //(5) Eliminar contacto del directorio
    public boolean eliminarContacto(Long numeroTelefono){   
        if(directorio.containsKey(numeroTelefono)){
            directorio.remove(numeroTelefono);
            return true; //para saber si lo encontro y lo ilimino   
        }
        else 
           return false; //si el numero no existe en el directorio
   
    }
    
    
    
    
    }
    

