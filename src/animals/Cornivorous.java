package animals;

import food.Food;
import food.Meat;



public abstract class  Cornivorous  extends Animal  {
    public EnSize enSize;
    public void eat(Food food) {

        eatFood = food instanceof Meat;
        if (!eatFood) {
            try {
                throw new WrongFoodException("Хищники едят только мясо!");

            } catch (WrongFoodException e) {
                System.out.println(food.foodName+" не годится!");
            }
        }
    }
}

