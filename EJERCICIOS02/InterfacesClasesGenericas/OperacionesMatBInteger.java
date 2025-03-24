package InterfacesClasesGenericas;

public class OperacionesMatBInteger implements Operable<Integer>{ @Override
	public Integer suma (Integer operandol, Integer operando2) {
	return operandol+ operando2;
	} 
@Override
public Integer resta (Integer operandol, Integer operando2) {
	return operandol - operando2;
	}
@Override
public Integer producto (Integer operandol, Integer operando2) {
	return operandol * operando2;
	}
@Override
public Integer division (Integer operandol, Integer operando2) {
	return operandol / operando2;
	}
}