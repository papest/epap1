package animals;

import food.Food;
import food.Meat;



public class Cornivorous extends Animal{
   // public boolean eatFood;

    public void eat(Food food) {

        eatFood=food instanceof Meat;
        System.out.println(eatFood);

    }
}

