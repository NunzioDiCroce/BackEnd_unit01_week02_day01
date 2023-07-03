package Esercizio3_Package;

// class definition
public class ContoOnLine extends ContoCorrente {

	// attributes
	double maxPrelievo;

	// constructor
	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	// methods
	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException {
		if (x <= maxPrelievo) {
			super.preleva(x);
		} else if (x > maxPrelievo) { // method modified
			throw new BancaException("Il prelievo non è disponibile");
		}

	}
}
