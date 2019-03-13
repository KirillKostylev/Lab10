package by.bntu.fitr.povt.keepthread.lab10.model.entity;

public class Animal {

    public static int animalCount;
    public static String[] ANIMAL_TYPE_STRINGS = {"Carnivorous", "Herbivore", "Omnivorous"};
    public String name;
    public int weight;
    public double nutritiousNeedsOnKg;
    public String animalType;

    static {animalCount = 1;}
    {animalCount++;}

    public Animal(){
    }

    public Animal(String name, int weight, double nutritiousNeedsOnKg, String animalType) {
        this.name = name;
        this.weight = weight;
        this.nutritiousNeedsOnKg = nutritiousNeedsOnKg;
        this.animalType = animalType;
    }

    public Animal(Animal animal) {
        name = animal.name;
        weight = animal.weight;
        nutritiousNeedsOnKg = animal.nutritiousNeedsOnKg;
        animalType = animal.animalType;
    }


    @Override
    public String toString() {
        return name + "(" + weight + " kg, " + animalType + ") ";
    }
}
