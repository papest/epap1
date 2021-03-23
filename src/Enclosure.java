
import animals.*;


import java.util.HashMap;


public class Enclosure<T extends EnSize,S extends Animal> {

    public EnSize sizeOfEnclosure;
    private HashMap<Integer, Animal> hashmap;
    public WhatAnimalEat  whatAnimalEat;


    public  Enclosure (T t) {

        sizeOfEnclosure = t;
        this.hashmap = new HashMap<>();
        System.out.println("Создан вольер размера "+this.sizeOfEnclosure);
    }



    public boolean putAnimalToEnclosure(S ourHero) {

        if (this.sizeOfEnclosure!=ourHero.enSize){
            System.out.println("Животному "+ourHero.name +" требуется вольер другого размера");
            return false;
        }

        if (this.hashmap.isEmpty()){
            if (ourHero instanceof Cornivorous){
                whatAnimalEat = WhatAnimalEat.MEAT;

            }else if(ourHero instanceof Herbivore){
                whatAnimalEat = WhatAnimalEat.GRASS;

            }else{
                System.out.println("Что за странный зверь у вас?");
                return false;
            }
        }
        if (((ourHero instanceof Cornivorous)&&(whatAnimalEat==WhatAnimalEat.MEAT)) ||((ourHero instanceof Herbivore)&&(whatAnimalEat==WhatAnimalEat.GRASS))){
            if (this.hashmap.put(ourHero.id,ourHero)==null){
                return true;
            }else{
                System.out.println("Животное уже в вольере");
                return false;
            }
        }else{
            switch (whatAnimalEat){
            case MEAT :
                System.out.println("Это вольер для хищников. "+ourHero.name+" - травоядное.");
                break;
            case GRASS :
                System.out.println("Это вольер для травоядных. "+ourHero.name+" - хищник." );
                break;
            }
            return false;
        }
     }


    public boolean removeAnimalFromEnclosure(Integer idAnimal) {
        Animal removeAnimal;

        if (!this.hashmap.isEmpty()){
            removeAnimal= this.hashmap.remove(idAnimal);
            if (removeAnimal!=null){
                System.out.println("Животное "+removeAnimal.id+ " успешно удалено из вольера");
                return true;
            }else{
                System.out.println("Животного нет в этом вольере");
                return false;
            }
        }else{
            System.out.println("Вольер пуст");
            return false;
        }
    }


    public Animal getAnimalFromEnclosure(Integer animalId) {

        if  (!this.hashmap.isEmpty()){
        if (this.hashmap.containsKey(animalId)) {
            return this.hashmap.get(animalId);
        }else {
            System.out.println("Животного нет в этом вольере");
            return null;
        }
        }else {
            return null;}
    }

}



   
  


