package mx.edu.utez;

// Clase que contiene Abstraccion
public abstract class Operacion {
    private double numero1;
    private double numero2;

    // Constructor
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Encapsulamiento con getters y setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Metodo abstracto implementado por las clases hijas
    public abstract double calcular();
}
