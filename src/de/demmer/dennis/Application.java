package de.demmer.dennis;

import de.demmer.dennis.graphics.Renderer;
import de.demmer.dennis.model.items.Potion;
import de.demmer.dennis.model.pokemon.Bisasam;
import de.demmer.dennis.model.pokemon.Pikachu;

public class Application {
	
	public static void main(String[] args) {
		
		
		Bisasam bisa = new Bisasam();
		Pikachu pika = new Pikachu();
		Potion potion = new Potion();
		
		Renderer renderer = new Renderer();
		
		
		renderer.render(pika);
		renderer.render(bisa);
		renderer.render(potion);

		
		
		
		
		
		
	}

}
