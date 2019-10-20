package com.banque.comptes;

public class Compte {
	
	private String numero;
	
	private Double montant;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	public void verser(double newMontant) {
		this.montant = this.montant + newMontant;
	}

}
