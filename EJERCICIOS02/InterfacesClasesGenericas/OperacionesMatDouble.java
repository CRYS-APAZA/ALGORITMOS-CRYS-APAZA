package InterfacesClasesGenericas;

// Clase para realizar operaciones específicas para números de tipo Double
public class OperacionesMatDouble implements Operable<Double> {

    @Override
    public Double suma(Double operando1, Double operando2) {
        // Devuelve la suma de dos números Double
        return operando1 + operando2;
    }

    @Override
    public Double resta(Double operando1, Double operando2) {
        // Devuelve la resta de dos números Double
        return operando1 - operando2;
    }

    @Override
    public Double producto(Double operando1, Double operando2) {
        // Devuelve el producto de dos números Double
        return operando1 * operando2;
    }

    @Override
    public Double division(Double operando1, Double operando2) {
        // Valida que no se divida por cero, si es cero lanza una excepción
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        // Devuelve la división de dos números Double
        return operando1 / operando2;
    }
}
