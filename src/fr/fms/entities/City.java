package fr.fms.entities;

public class City {
	 private String name;
	    private String country;
	    private int numberInhabitants;

	    // Constructeur par défaut
	    public City() {
	        this.name = "Inconnu";
	        this.country = "Inconnu";
	        this.numberInhabitants = 0;
	    }

	    // Constructeur avec paramètres
	    public City(String name, String country, int numberInhabitants) {
	        this.name = name;
	        this.country = country;
	        this.numberInhabitants = numberInhabitants;
	    }

	    // Getters et Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public int getNumberInhabitants() {
	        return numberInhabitants;
	    }

	    public void setNumberInhabitants(int numberInhabitants) {
	        this.numberInhabitants = numberInhabitants;
	    }

	    // Méthode toString
	    @Override
	    public String toString() {
	        return name + ", " + country + ", " + numberInhabitants + " d'habitants";
	    }

}
