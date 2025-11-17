package fr.fms.entities;

public class Capital extends City {
	private String monument;

    // Constructeur par défaut
    public Capital() {
        super(); // Appel du constructeur de la classe mère
        this.monument = "Inconnu";
    }

    // Constructeur avec paramètres
    public Capital(String name, String country, int numberInhabitants, String monument) {
        super(name, country, numberInhabitants); // Appel du constructeur de la classe mère
        this.monument = monument;
    }

    // Getter et Setter pour le monument
    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return  super.toString() + " monument : " + monument;
    }

}
