package ejercicio2;

// Metodo que representa una carta individual de la baraja.

public class Card {

	public String suit;  // Palo de la carta
	public String value; // Valor de la carta
	
	// inicia una carta con su palo y valor.

	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	// Método para representar la carta en return Cadena con la forma "palo-valor"
	
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}