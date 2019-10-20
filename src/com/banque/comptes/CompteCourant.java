package com.banque.comptes;

public class CompteCourant extends Compte{

	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/**
	 * 
	 * @param montant
	 * @return
	 */
	public boolean retirer(double montant) {
		//On vérifie que l'opération peut s'effectuer sur le montant actuel
		if(this.getMontant() - montant> 0 ) {
			this.setMontant(this.getMontant()-montant);
			return true;
		}else {
			return false;
		}
		
		
	}
	/**
	 * 
	 * @param montant
	 * @param compte
	 * @return
	 */
	public boolean verser(double montant, Compte compte) {
		compte.verser(montant);
		return true;

	}
}
