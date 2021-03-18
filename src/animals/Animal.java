package animals;

import food.Food;

public abstract class Animal {
    public EnSize enSize;
    public String voice;
    public boolean eatFood;
    public String name;
    public abstract void eat(Food food);
    public static Integer idAnimal=0;
    public Integer id;
    public static void incrementId(){
   ++idAnimal;
 }

}

