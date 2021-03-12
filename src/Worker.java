import animals.Animal;
import animals.Voice;
import food.Food;


class Worker {

    private  static Animal workerAnimal;
   // private static Animal.Voice animalVoice;
    private static Food workerFood;


    private  String workerName;

    public Worker(String workerName) {
        this.workerName=workerName;

    }


        public static void feed(Food food,Animal animal) {
       workerAnimal=animal;
       workerFood=food;
       animal.eat(food);
       if (workerAnimal.eatFood) {
                System.out.println("Ест с удовольствием!");
            } else {
                System.out.println("Отказывается есть");
            }
        }

        public static void getVoice(Voice c){
        System.out.println( c.voice());
        }

}
