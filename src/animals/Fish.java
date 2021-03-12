package animals;

public class Fish extends Herbivore implements Swim {

   void setName(String fidhName){
       String name=fidhName;
   }

    @Override
    public void swim() {
        {System.out.println ("Рыба плывет!");}
    }
}

