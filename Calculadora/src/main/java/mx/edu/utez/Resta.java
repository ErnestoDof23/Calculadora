package mx.edu.utez;

public class Resta extends Operacion {
    public Resta(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return getNumero1() - getNumero2();
    }
}
