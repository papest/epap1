package animals;

import static animals.EnSize.MIDDLESIZE;


public class Goat extends Herbivore implements Voice, Run, Swim {


   public Goat() {
        name="Коза";
        Animal.incrementId();
       id=Animal.idAnimal;
       enSize= EnSize.MIDDLESIZE;
   }


    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public void run() {
        System.out.println(name+" "+ Run.interfaceName()+"!");
    }

    @Override
    public void swim() {
        System.out.println(name+" "+ Swim.interfaceName()+"!");
    }

    @Override
    public String voice() {
        return "Ме-мее!";
    }
}

