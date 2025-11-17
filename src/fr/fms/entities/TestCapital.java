package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		// Instanciation de plusieurs capitales
        Capital paris = new Capital("Paris", "France", 2148000, "Tour Eiffel");
        Capital londres = new Capital("Londres", "Royaume-Uni", 8982000, "Big Ben");
        Capital rome = new Capital("Rome", "Italie", 2873000, "Colisée");

        // Affichage initial
        System.out.println("=== CAPITALES INITIALES ===");
        System.out.println(paris);
        System.out.println(londres);
        System.out.println(rome);

	}

}
