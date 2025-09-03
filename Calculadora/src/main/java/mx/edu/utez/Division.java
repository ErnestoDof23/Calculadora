package mx.edu.utez;

public class Division extends Operacion {
    public Division(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        if (getNumero2() == 0) {
            throw new ArithmeticException("No se puede dividir entre 0.");
        }
        return getNumero1() / getNumero2();
    }
}
