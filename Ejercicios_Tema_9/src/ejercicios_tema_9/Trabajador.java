package ejercicios_tema_9;

public class Trabajador extends Persona {

    private double salario;

    // Constructor
    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    // Método get
    public double getSalario() {
        return salario;
    }

    // Método set
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
