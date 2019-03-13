package by.bntu.fitr.povt.keepthread.lab10.model.logic;

import by.bntu.fitr.povt.keepthread.lab10.model.entity.Animal;
import by.bntu.fitr.povt.keepthread.lab10.model.entity.AnimalsSpecie;
import by.bntu.fitr.povt.keepthread.lab10.model.entity.Food;

public class Manager {

    public static String calculateFoodCostInDay(AnimalsSpecie animalsSpecie, Food food) {
        String msg = "Can't use this food to this animals";
        if (animalsSpecie.animalsType.equals(food.animalType)) {
            int totalNutritiousNeedsInKg = 0;
            for (Animal animal : animalsSpecie.animals) {
                totalNutritiousNeedsInKg += animal.weight * animal.nutritiousNeedsOnKg;
            }
            double cost = totalNutritiousNeedsInKg * food.costOnKg;
            msg = "You need spend " + cost + " Br every day " + animalsSpecie.name + " with " + food.title
                    + " every day.";
        }
        return msg;
    }

}
