package ejercicios_tema_8;

//Creamos la clase persona
class Persona {
    // Variables privadas de la clase
    private int edad;
    private String nombre;
    private String telefono;
    
    // Métodos "get" para obtener el valor de cada propiedad
    public int getEdad() {
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    // Métodos "set" para establecer el valor de cada propiedad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

public class Ejercicios_Tema_8 {
    
    public static void main(String[] args) {
         // Crear un objeto de la clase Persona
        Persona persona = new Persona();
        
        // Establecer los valores de las propiedades de la persona
        persona.setEdad(30);
        persona.setNombre("Juan");
        persona.setTelefono("555-555-1234");
        
        // Mostrar los valores de las propiedades de la persona
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
    
}
