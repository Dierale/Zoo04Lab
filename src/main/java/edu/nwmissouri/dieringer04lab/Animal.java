package edu.nwmissouri.dieringer04lab;

/**
 * The Animal super class, only able to make instances of subclasses as per
 * abstract keyword
 *
 * @author Alexander Dieringer
 */
public abstract class Animal {

    // Declared protected variables
    protected String name = "Unnamed";

    protected String species_name = "No Species Found";
    protected String species_latin = "No Latin Available";
    protected String locationFound = "No Location Found";
    protected int sleepDuration_hours = 0;
    protected double movementSpeed_mph = 0;
    protected boolean isExtinct = false;

    /**
     * Class constructor for Animal
     *
     * @param name The name of this animal object
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * speak() - Presents the types of sounds made by the animal
     */
    public void speak() {
        System.out.println("Generic animal sounds and calls");
    }

    /**
     * move() - Describes the general type of movement the animal makes
     */
    public void move() {
        System.out.println("Generic animal movement around enclosure");
    }

    /**
     * getMyName()  - Describes the name given to the Animal by the constructor
     */
    public void getMyName() {
        System.out.println("Hello, my name is : " + this.name + "!");
    }
    
    /**
     * getSpeciesName() - Checks what the Animal is normally called (species)
     */
    public void getSpeciesName() {
        System.out.println("My species is called " + this.species_name);
    }

    /**
     * getLatinName() - Checks for the Latin name of the Animal's species
     */
    public void getLatinName() {
        System.out.println("Sometimes I'm referred to as the species: " + this.species_latin);
    }

    /**
     * getLocationFound() - Checks where the Animal lives
     */
    public void getLocationFound() {
        System.out.println("My preferred habit is: " + this.locationFound);
    }

    /**
     * getSleepDuration() - Checks how long the Animal sleeps per day in hours
     */
    public void getSleepDuration() {
        System.out.println("When I get tired I like to sleep for "
                + this.sleepDuration_hours + " hours");
    }

    /**
     * getMovementSpeed() - Checks how fast the Animal can move in miles per
     * hour
     */
    public void getMovementSpeed() {
        System.out.println("When I'm really speeding along I max out at "
                + this.movementSpeed_mph + " mph");
    }

    /**
     * getIsExtinct() - Checks if the Animal is extinct or not
     */
    public void getIsExtinct() {
        String isFound = (this.isExtinct) ? "yes" : "no";
        System.out.println("Can you find me out in the wild? The answer is "
                + isFound);
    }

    /**
     * 
     */
    public void callAllMethods() {
        getMyName();
        speak();
        move();
        getSpeciesName();
        getLatinName();
        getLocationFound();
        getSleepDuration();
        getMovementSpeed();
        getIsExtinct();
    }
}
