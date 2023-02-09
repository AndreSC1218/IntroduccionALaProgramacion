package ejercicios_tema_9;

public class Cliente extends Persona {

    private double credito;

    // Constructor
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    // Método get
    public double getCredito() {
        return credito;
    }

    // Método set
    public void setCredito(double credito) {
        this.credito = credito;
    }
}
