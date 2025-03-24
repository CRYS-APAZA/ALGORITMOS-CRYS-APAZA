package InterfacesClasesGenericas;

// Clase genérica que implementa la interfaz Operable para realizar operaciones matemáticas
public class OperacionesMat<T extends Number> implements Operable<T> {

    @SuppressWarnings("unchecked")
    @Override
    public T suma(T operando1, T operando2) {
        // Realiza la suma dependiendo del tipo de dato (Integer o Double)
        if (operando1 instanceof Integer) {
            return (T) Integer.valueOf(operando1.intValue() + operando2.intValue());
        } else if (operando1 instanceof Double) {
            return (T) Double.valueOf(operando1.doubleValue() + operando2.doubleValue());
        }
        // Lanza una excepción si el tipo de dato no es soportado
        throw new UnsupportedOperationException("Tipo no soportado.");
    }

    @SuppressWarnings("unchecked")
    @Override
    public T resta(T operando1, T operando2) {
        // Realiza la resta dependiendo del tipo de dato (Integer o Double)
        if (operando1 instanceof Integer) {
            return (T) Integer.valueOf(operando1.intValue() - operando2.intValue());
        } else if (operando1 instanceof Double) {
            return (T) Double.valueOf(operando1.doubleValue() - operando2.doubleValue());
        }
        // Lanza una excepción si el tipo de dato no es soportado
        throw new UnsupportedOperationException("Tipo no soportado.");
    }

    @SuppressWarnings("unchecked")
    @Override
    public T producto(T operando1, T operando2) {
        // Realiza el producto dependiendo del tipo de dato (Integer o Double)
        if (operando1 instanceof Integer) {
            return (T) Integer.valueOf(operando1.intValue() * operando2.intValue());
        } else if (operando1 instanceof Double) {
            return (T) Double.valueOf(operando1.doubleValue() * operando2.doubleValue());
        }
        // Lanza una excepción si el tipo de dato no es soportado
        throw new UnsupportedOperationException("Tipo no soportado.");
    }

    @SuppressWarnings("unchecked")
    @Override
    public T division(T operando1, T operando2) {
        // Valida que no se divida por cero, si es cero lanza una excepción
        if (operando2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        // Realiza la división dependiendo del tipo de dato (Integer o Double)
        if (operando1 instanceof Integer) {
            return (T) Integer.valueOf(operando1.intValue() / operando2.intValue());
        } else if (operando1 instanceof Double) {
            return (T) Double.valueOf(operando1.doubleValue() / operando2.doubleValue());
        }
        // Lanza una excepción si el tipo de dato no es soportado
        throw new UnsupportedOperationException("Tipo no soportado.");
    }
}
