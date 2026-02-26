import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaracion de variables
        double peso; // masa ingresada por el usuario en kg
        double altura; // altura ingresada por el usuario en metros
        double IMC; // indice de masa corporal, resultado de dividir peso / altura
        byte repetir; // varialbe usada para repetir la pregunta cuantas veces el usuario quiera

        // Comienzo algoritmo
        Scanner teclado = new Scanner (System.in);

        do {
            // Pide datos al usuario
            System.out.println("\nBienvenido, este algoritmo le permitira saber su estado nutricional " +
                    "actual en base a su Indice de Masa Corporal (IMC)");
            System.out.println("Porfavor ingrese su PESO en KILOGRAMOS (kg): ");
            peso = teclado.nextDouble();
            System.out.println("Porfavor ingrese su ALTURA en METROS (m) : ");
            altura = teclado.nextDouble();

            // Calcula el IMC y lo imprime
            IMC = peso / (altura * altura);

            System.out.println("Su IMC equivale a: " + IMC);

            // Compara el valor de IMC, para decirle el estado de peso actual al usuario
            System.out.println("En base a estos resultados, su estado de peso actual es de: \n");

            if (IMC > 0 && IMC < 18.5) {
                System.out.println("Peso bajo");
            } else if (IMC >= 18.5 && IMC <= 24.9) {
                System.out.println("Peso normal");
            } else if (IMC >= 25 && IMC <= 26.9) {
                System.out.println("Sobrepeso grado 1");
            } else if (IMC >= 27 && IMC <= 29.9) {
                System.out.println("Sobrepeso grado 2");
            } else if (IMC >= 30 && IMC <= 34.9) {
                System.out.println("Obecidad tipo 1");
            } else if (IMC >= 35 && IMC <= 39.9) {
                System.out.println("Obecidad tipo 2");
            } else if (IMC >= 40 && IMC <= 49.9) {
                System.out.println("Obecidad morbida");
            } else if (IMC >= 50) {
                System.out.println("Obecidad extrema");
            } else {
                System.out.println("Los datos ingresados son inhumanos");
            }
            // Se pregunta al usuario si este quiere repetir la pregunta
            repetir = 2;
            while (repetir < 0 || repetir > 1) {
                System.out.println("\nDesea volver a calcular su IMC?\n   Si es asi, escriba 1, sino 0");
                repetir = teclado.nextByte();
                // si el usuario pone otro numero que no sea 0 o 1, se le vuelve a preguntar
                if (repetir < 0 || repetir > 1) {
                    System.out.println("Error, porfavor responda nuevamente");
                }
            }
        } while (repetir == 1);
    }
}