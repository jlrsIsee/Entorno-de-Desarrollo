package ejercicio2;

import java.util.ArrayList;


 
public class DeckCards {  //Clase principal que simula la creación, barajado ymuestra baraja de cartas de póker.

	public static void main(String[] args) {

		// Definición de los palos posibles de la baraja
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		// Definición de los valores posibles de las cartas
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Creación lista dinámica para almacenar las cartas de la baraja
		ArrayList<Card> deck = new ArrayList<Card>();

		// Bucle para combinar cada palo con cada valor y rellenar la baraja (52 cartas)
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		// Randomizador para barajar las cartas de forma aleatoria
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		// Muestra por pantalla las primeras 5 cartas de la baraja ya mezclada
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}