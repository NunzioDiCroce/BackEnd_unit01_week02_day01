package Esercizio3_Package;

public class BancaException extends Exception {

	// attributes
	public String message;

	// constructor
	public BancaException(String _message) {

		super(_message);
		this.message = _message;
	}

	@Override
	public String toString() {
		return message;

	}

}
