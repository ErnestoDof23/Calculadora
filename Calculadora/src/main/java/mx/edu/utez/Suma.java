package mx.edu.utez;

// Herencia y polimorfismo
public class Suma extends Operacion {
    public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return getNumero1() + getNumero2();
    }
}
