package Esercizio3_Package;

// class definition
public class ContoCorrente {

	// attributes
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	// constructor
	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	// methods
	void preleva(double x) throws BancaException {
		if (nMovimenti < maxMovimenti)
			saldo = saldo - x;
		else
			saldo = saldo - x - 0.50;

		if (saldo < 0) { // method modified
			throw new BancaException("Il conto è in rosso");
		}

		nMovimenti++;
	}

	double restituisciSaldo() {
		return saldo;
	}

}
