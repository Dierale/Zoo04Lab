package edu.nwmissouri.dieringer04lab;

/**
 * The class Aardvark, a subclass of Animal
 *
 * @author Alexander Dieringer
 */
public class Aardvark extends Animal {
    
    public Aardvark(String name) {
        super(name);
        
        this.species_name = "Aardvark";
        this.species_latin = "Orycteropus afer";
        this.locationFound = "sub-Saharan Africa";
        this.sleepDuration_hours = 16;
        this.movementSpeed_mph = 25;
        this.isExtinct = false;
    }

    /**
     * speak() - Presents the types of sounds made by the Aardvark
     */
    @Override
    public void speak() {
        System.out.println("I'm an Aardvark, I make grunting sounds most of the time.");
    }

    /**
     * move() - Describes the general type of movement the Aardvark makes
     */
    @Override
    public void move() {
        System.out.println("I like to burrow around in the ground and avoid rocky areas.");
    }
}
