package ejerciciostema3;

public class EjerciciosTema3 {
    //Creamos la funcion suma
    public static int suma(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }
    public static void main(String[] args) {
    //llamamos a la funcion y le damos valores
    int resultado = suma(5, 7, 3);
    System.out.println("La suma de los 3 numeros es: " + resultado);
    
    //Creamos un objeto coche
    Coche miCoche = new Coche(2);
    System.out.println("El numero de puertas es: " + miCoche.getNumPuertas());
    
    //Agregamos una puerta
    miCoche.agregarPuerta();
    System.out.println("El nuevo numero de puertas es: " + miCoche.getNumPuertas());
    }
    
}
