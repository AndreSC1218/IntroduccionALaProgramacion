package ejercicios_tema_9;

public class Ejercicios_Tema_9 {

    public static void main(String[] args) {
        // Creación del objeto Cliente
        Cliente cliente = new Cliente(35, "Juan", "555-555-555", 1000.0);
        // Impresión de las propiedades del Cliente
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        // Creación del objeto Trabajador
        Trabajador trabajador = new Trabajador(30, "Ana", "444-444-444", 2000.0);
        // Impresión de las propiedades del Trabajador
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }

}
