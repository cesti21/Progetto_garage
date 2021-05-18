package model;

/**
 * questa classe costruisce il veicolo
 * 
 * @author andrea cestaro e francesco marsura
 *
 */
public class Veicolo {
	private String targa;
	private String modello;
	private String cognome;
	private String nome;
	public int ore;

	/**
	 * costruisce veicolo
	 * 
	 * @param targa   targa auto
	 * @param modello modello auto
	 * @param cognome cognome proprietario
	 * @param nome    nome proprietario
	 * @param ore     ore di sosta
	 */
	public Veicolo(String targa, String modello, String cognome, String nome, int ore) {
		this.targa = targa;
		this.modello = modello;
		this.cognome = cognome;
		this.nome = nome;
		this.ore = ore;
	}

	/**
	 * restituisce la targa
	 * 
	 * @return targa targa
	 */

	public String getTarga() {
		return targa;
	}

	/**
	 * inserisce la targa
	 * 
	 * @param targa targa
	 */

	public void setTarga(String targa) {
		this.targa = targa;
	}

	/**
	 * restituisce il modello dell'auto
	 * 
	 * @return modello modello
	 */

	public String getModello() {
		return modello;
	}

	/**
	 * inserisce il modello
	 * 
	 * @param modello modello
	 */

	public void setModello(String modello) {
		this.modello = modello;
	}

	/**
	 * restituisce il cognome del proprietario
	 * 
	 * @return cognome cognome
	 */

	public String getCognome() {
		return cognome;
	}

	/**
	 * inserisce il cognome del proprietario
	 * 
	 * @param cognome cognome
	 */

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * restituisce il nome del proprietario
	 * 
	 * @return nome nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * inserisce il nome del proprietario
	 * 
	 * @param nome nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * restituisce il numero di ore di sosta
	 * 
	 * @return ore ore
	 */
	public int getOre() {
		return ore;
	}

	/**
	 * inserisce il numero di ore di sosta
	 * 
	 * @param ore ore
	 */
	public void setOre(int ore) {
		this.ore = ore;
	}

	/**
	 * stampa i valori
	 */
	public String toString() {
		return cognome + " " + nome + " (targa: " + targa + ", modello: " + modello + ", ore: " + ore + ")";
	}

}
