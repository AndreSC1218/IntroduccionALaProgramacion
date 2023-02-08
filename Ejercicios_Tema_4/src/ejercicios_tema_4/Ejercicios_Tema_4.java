package ejercicios_tema_4;

public class Ejercicios_Tema_4 {

    public static void main(String[] args) {
        // Variable para comparar si es positivo, negativo o 0
        int numeroIf = 2;

        // Condición para comparar el valor de numeroIf
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        // Bucle While
        int numeroWhile = 0;
        // Condición para que el bucle se ejecute mientras numeroWhile sea menor a 3
        while (numeroWhile < 3) {
            // Incremento de numeroWhile
            numeroWhile++;
            // Muestra por pantalla el valor de numeroWhile
            System.out.println("While: " + numeroWhile);
        }

        // Bucle Do While
        int numeroDoWhile = 0;
        do {
            // Incremento de numeroDoWhile
            numeroDoWhile++;
            // Muestra por pantalla el valor de numeroDoWhile
            System.out.println("Do While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle For
        // Inicialización de la variable numeroFor a 0
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            // Muestra por pantalla el valor de numeroFor
            System.out.println("For: " + numeroFor);
        }

        // Switch
        String estacion = "primavera";
        // Comparación del valor de estacion con diferentes casos
        switch (estacion) {
            case "primavera":
                System.out.println("Estación: Primavera");
                break;
            case "verano":
                System.out.println("Estación: Verano");
                break;
            case "otono":
                System.out.println("Estación: Otoño");
                break;
            case "invierno":
                System.out.println("Estación: Invierno");
                break;
            default:
                System.out.println("Estación no válida");
                break;
        }
    }
}
