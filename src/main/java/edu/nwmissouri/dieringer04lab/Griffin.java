package edu.nwmissouri.dieringer04lab;

/**
 * The class Griffin, a subclass of Animal
 *
 * @author Alexander Dieringer
 */
public class Griffin extends Animal {

    public Griffin(String name) {
        super(name);
        
        this.species_name = "Griffin";
        this.species_latin = "grȳpus";
        this.locationFound = "Fantasy";
        this.sleepDuration_hours = 8;
        this.movementSpeed_mph = 80;
        this.isExtinct = true;
    }

    /**
     * speak() - Presents the types of sounds made by the Griffin
     */
    public void speak() {
        System.out.println("I'm a Griffin and I chirp like a bird, but I can "
                + "trumpet loudly if angry.");
    }

    /**
     * move() - Describes the general type of movement the animal Griffin
     */
    public void move() {
        System.out.println("I can walk but I really enjoy flying through the sky.");
    }
}
