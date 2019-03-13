package by.bntu.fitr.povt.keepthread.lab10.Controller;

import by.bntu.fitr.povt.keepthread.lab10.model.entity.Animal;
import by.bntu.fitr.povt.keepthread.lab10.model.entity.AnimalsSpecie;
import by.bntu.fitr.povt.keepthread.lab10.model.entity.Food;
import by.bntu.fitr.povt.keepthread.lab10.model.logic.Manager;
import by.bntu.fitr.povt.keepthread.lab10.view.Printer;

public class Main {

    public static void main(String[] args) {
        Animal lion1 = new Animal("Lion1", 130, 0.100, "carnivorous");
        Animal lion2 = new Animal("Lion2", 100, 0.100, "carnivorous");
        AnimalsSpecie lions = new AnimalsSpecie("Lion", lion1, lion2);
        Food meat = new Food("meat", 6, "carnivorous");
        Printer.print(Manager.calculateFoodCostInDay(lions, meat));
    }
}

