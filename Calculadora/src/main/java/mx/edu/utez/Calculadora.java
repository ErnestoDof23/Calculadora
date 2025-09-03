package mx.edu.utez;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        int opcion;

        System.out.println("===Calculadora Funeited ===");
        System.out.print("Ingrese el primer numero: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextDouble();

        System.out.println("\nElije la operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Opcion: ");
        opcion = sc.nextInt();

        Operacion operacion = null;

        switch (opcion) {
            case 1 -> operacion = new Suma(a, b);
            case 2 -> operacion = new Resta(a, b);
            case 3 -> operacion = new Multiplicacion(a, b);
            case 4 -> operacion = new Division(a, b);
            default -> System.out.println("Error :(.");
        }

        if (operacion != null) {
            System.out.println("Resultado: " + operacion.calcular());
        }

        sc.close();
    }
}
