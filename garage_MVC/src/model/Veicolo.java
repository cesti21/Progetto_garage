package model;

public class Veicolo {
	private String targa;
	private String modello;
	private String cognome;
	private String nome;
	public int ore;
	// public int posti = 25;

	public Veicolo(String targa, String modello, String cognome, String nome, int ore) {
		this.targa = targa;
		this.modello = modello;
		this.cognome = cognome;
		this.nome = nome;
		this.ore = ore;
		// TODO Auto-generated constructor stub
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	public String toString() {
		return cognome + " " + nome + " (targa: " + targa + ", modello: " + modello + ", ore: " + ore + ")";
	}

}
