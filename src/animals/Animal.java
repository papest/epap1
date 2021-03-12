package animals;

import food.Food;

public abstract class Animal {


  public String voice;
  public boolean eatFood;
  public String name;

  public abstract void eat(Food food);


}

