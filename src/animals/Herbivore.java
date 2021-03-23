package animals;

import food.Food;
import food.Grass;


public abstract class Herbivore extends Animal {

    public void eat(Food food) {

        eatFood=food instanceof Grass;
        if (!eatFood) {
            try {
                throw new WrongFoodException("Травоядные едят только траву!");
            }
            catch (WrongFoodException e) {
                     System.out.print(food.foodName+" не годится!");

            }
        }
    }

}

