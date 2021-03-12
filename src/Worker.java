import animals.Animal;
import animals.Voice;
import food.Food;


class Worker {


    private  String workerName;

    public Worker(String workerName) {
        this.workerName=workerName;

    }


      public static void feed(Food food,Animal animal) {

        animal.eat(food);
        if (animal.eatFood) {
                System.out.println(animal.name+(" ест с удовольствием!"));
            } else {
                System.out.println(animal.name+" отказывается есть");
            }
      }

      public static void getVoice(Voice c){
        System.out.println( c.voice());
        }

}
