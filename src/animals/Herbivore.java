package animals;

import food.Food;
import food.Grass;


public abstract class Herbivore extends Animal {

    public void eat(Food food) {

        eatFood=food instanceof Grass;

    }
}
