package ejerciciostema3;

public class Coche {
  private int numPuertas;

  public Coche(int numPuertas) {
    this.numPuertas = numPuertas;
  }

  public void agregarPuerta() {
    this.numPuertas++;
  }

  public int getNumPuertas() {
    return this.numPuertas;
  }
}
