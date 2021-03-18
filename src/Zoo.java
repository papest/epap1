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
        Gopher gopher=new Gopher();
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
                worker.feed(zooFood[j], zooAnimal[i]);
            }
        }
        System.out.print(wolf.name);
        worker.getVoice(wolf);
        System.out.print(goat.name);
        worker.getVoice(goat);
        System.out.print(penguin.name);
        worker.getVoice(penguin);
        //Worker.getVoice(fish); - ошибка компиляции
        Enclosure<Cornivorous> enclosure= new Enclosure<>(wolf.enSize);
        Enclosure<Herbivore> enclosure1= new Enclosure<>(EnSize.LITTLESIZE);
        System.out.println(gopher.enSize+" "+enclosure.sizeOfEnclosure);
        if (enclosure.putAnimalToEnclosure(wolf)){
            System.out.print(gopher.enSize+" ");
            System.out.println(gopher.name+"переведен в вольер");
        }
         if (enclosure1.putAnimalToEnclosure(gopher)){
             System.out.print(gopher.enSize+" ");
             System.out.println(gopher.name+"переведен в вольер");
         }

        if (enclosure1.putAnimalToEnclosure(gopher)){
        System.out.println(gopher.enSize+" ");
         System.out.println(gopher.name+"переведен в вольер");
       }
    }
}

