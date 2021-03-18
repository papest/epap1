import animals.Animal;
import animals.Voice;
import food.Food;


class Worker {


    private final String workerName;

    public Worker(String workerName) {
        this.workerName=workerName;

    }


      public void feed(Food food,Animal animal) {

        animal.eat(food);
        if (animal.eatFood) {
                System.out.println(animal.name+" ест с удовольствием "+food.foodName+"!");
            } else {
                System.out.println(animal.name+" отказывается есть "+food.foodName+"!");
            }
      }

      public void getVoice(Voice c){
        System.out.println(" "+Voice.interfaceName()+" "+ c.voice());
        }

}
