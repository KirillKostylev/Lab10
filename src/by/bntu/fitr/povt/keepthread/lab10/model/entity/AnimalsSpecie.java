package by.bntu.fitr.povt.keepthread.lab10.model.entity;

public class AnimalsSpecie {

    public String name;
    public Animal[] animals;
    public String animalsType;

    public AnimalsSpecie() {
    }

    public AnimalsSpecie(String name) {
        this.name = name;
    }

    public AnimalsSpecie(String name, Animal... animals) {
        this.name = name;
        this.animals = animals;
        if (animals.length != 0) {

            this.animalsType = animals[0].animalType;
        }
    }

    public AnimalsSpecie(AnimalsSpecie animalsSpecie) {
        name = animalsSpecie.name;
        animals = animalsSpecie.animals;
        animalsType = animalsSpecie.animalsType;
    }

    @Override
    public String toString() {
        String msg = name + ": ";
        int counter = 1;
        for (Animal animal : animals) {
            msg += animal;
            if (counter == animals.length) {
                msg += ".";
            } else {
                msg += ", ";
            }
            counter++;
        }
        return msg;
    }
}
