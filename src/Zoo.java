import animals.*;
import food.*;


public class Zoo {
    public static void main(String[] args) {
        Worker worker = new Worker("Владимир Петрович");
        Wolf wolf = new Wolf();
        Oats oats = new Oats();
        Duck duck = new Duck();
        wolf.eat(oats);
        Goat goat = new Goat();
        Fish fish = new Fish();
        Penguin penguin = new Penguin();
        Swim[] pond = {fish, duck, penguin};
        Animal[] zooAnimal = {new Fish(),new Duck(),new Goat(),new Gopher(),new Penguin(),new Wolf()};
        Food[] zooFood = {new Beefsteak(),new Meatball(),new Corn(),new Hay(),new Meatloaf(),new Oats()};

        int i; int j;
        for (i = 0; i < pond.length; i++) {
            pond[i].swim();
        }
        for (i = 0; i < zooAnimal.length; i++){
            for(j = 0; j < zooFood.length; j++){
                Worker.feed(zooFood[j], zooAnimal[i]);
            }
        }
        System.out.print(wolf.name);
        Worker.getVoice(wolf);
        System.out.print(goat.name);
        Worker.getVoice(goat);
        System.out.print(penguin.name);
        Worker.getVoice(penguin);
        //Worker.getVoice(fish); - ошибка компиляции


    }
}

