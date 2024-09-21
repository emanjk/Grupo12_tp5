
package vistaDirectorio;


public class Contacto {
     //Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    

    //Constructor
    public Contacto(int dni, String nombre, String apellido, String direccion, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion; 
        this.ciudad = ciudad;       
    }

    //metodos getters
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    //Metodos setters
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    

   @Override
    public String toString() {
    return "DNI: " + dni + " Nombre: " + nombre + " Apellido: " + apellido + " Direccion: " + direccion + " Ciudad: " + ciudad;
}
    
}
