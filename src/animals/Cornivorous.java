package animals;

import food.Food;
import food.Meat;



public abstract class  Cornivorous extends Animal{


    public void eat(Food food) {

        eatFood=food instanceof Meat;

    }
}

