package animals;

import food.Food;
import food.Grass;


public class Herbivore extends Animal {

    //public boolean eatFood;
    public void eat(Food food) {

        eatFood=food instanceof Grass;
        System.out.println("Травоядные"+eatFood);
    }
}
