package edu.nwmissouri.dieringer04lab;

/**
 * The class Ibis, a subclass of Animal
 *
 * @author Alexander Dieringer
 */
public class Ibis extends Animal {
    
    public Ibis(String name) {
        super(name);
        
        this.species_name = "Ibis";
        this.species_latin = "Threskiornithinae";
        this.locationFound = "Asia, Australasia, and sub-Saharan Africa ";
        this.sleepDuration_hours = 13;
        this.movementSpeed_mph = 25;
        this.isExtinct = false;
    }

    /**
     * speak() - Presents the types of sounds made by the Ibis
     */
    @Override
    public void speak() {
        System.out.println("I'm an Ibis, I make murmuring or grunting sounds but sometimes I yelp.");
    }

    /**
     * move() - Describes the general type of movement the Ibis makes
     */
    @Override
    public void move() {
        System.out.println("I like forage in marshy wetlands and mudflats, I can fly but I often wade through the water.");
    }
}
