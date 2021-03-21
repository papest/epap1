
import animals.*;
import java.util.HashMap;


public class Enclosure<T extends EnSize> {

    public EnSize sizeOfEnclosure;
    private HashMap<Integer, Animal> hashmap;
    private Animal ourHero_;
    public WhatAnimalEat  whatAnimalEat;
    //public Integer id;

   public  Enclosure(T t)// throws IllegalAccessException, InstantiationException{
   {  sizeOfEnclosure = t;
      this.hashmap = new HashMap<>();
      System.out.println("Создан вольер размера "+this.sizeOfEnclosure);
   }

   public boolean putAnimalToEnclosure(Cornivorous ourHero) {
       ourHero_= ourHero;

       System.out.println(" putAnimalToEnclosure" + this.sizeOfEnclosure + " "
               + ourHero.id.toString() +" "+ourHero.name);
       this.whatAnimalEat=WhatAnimalEat.MEAT;
       // if (this.sizeOfEnclosure.equals(cornivorous.enSize)) {
        //    System.out.println("Вольер подходит.");
         //   if (this.hashmap1 == null) {
         //       this.hashmap1 = new HashMap<>();
          //      this.hashmap1.put(cornivorous.id, cornivorous);
               return true;
           // } else if (!hashmap1.containsKey(cornivorous.id)) {
           //     this.hashmap1.put(cornivorous.id, cornivorous);
            //    System.out.println("Животное " + cornivorous.name + " размещено.");
            //    return true;
           // } else {
            //    System.out.println("Животное " + cornivorous.name + " номер в зоопарке " + cornivorous.id + "уже в вольере.");
            //    return false;
           // }
       // } else {
        //    return false;
      //  }
    }



    public boolean putAnimalToEnclosure(Herbivore ourHero) {
        System.out.println(" putAnimalToEnclosure" + this.sizeOfEnclosure + " " + ourHero.enSize+ " "+ (ourHero.id).toString());
        this.whatAnimalEat=WhatAnimalEat.GRASS;
        //if (enclosure.sizeOfEnclosure == EnSize.LITTLESIZE) {
        //if (this.sizeOfEnclosure.equals(herbivore.enSize)) {
           // System.out.println("Вольер подходит.");
           // if (!hashmap.containsKey(herbivore.id)) {
            //    this.hashmap.put(herbivore.id, herbivore);

                System.out.println("Животное " + ourHero.name + " размещено.");
                return true;
            //} else {
             //   System.out.println("Животное " + herbivore.name + " номер в зоопарке " + herbivore.id + "уже в вольере.");
             //   return false;
           // }
       // } else {
       //     return false;
       // }
    }


    public boolean removeAnimalFromEnclosure(Cornivorous cornivorous) {

        if (this.hashmap.containsKey(cornivorous.id)) {
            this.hashmap.remove(cornivorous.id);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAnimalFromEnclosure(Herbivore herbivore) {

        if (this.hashmap.containsKey(herbivore.id)) {
            this.hashmap.remove(herbivore.id);
            return true;
        } else {
            return false;
        }

    }

    public Animal getAnimalFromEnclosure(Integer animalId) {
        if  (this.hashmap!=null){
        if (this.hashmap.containsKey(animalId)) {
            return this.hashmap.get(animalId);
        } else {
            return null;
        }}
        return null;
   }

}



   
  


