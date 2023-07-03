package Esercizio3_Package;

// class definition
public class ContoOnLine extends ContoCorrente {

	// properties
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

	void preleva(double x) {
		if (x <= maxPrelievo) {
			super.preleva(x);
		}
	}
}
