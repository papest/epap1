import animals.*;
import food.*;

public class Zoo {
    public static  void main(String[] args) {
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



        Animal[]  demo1 = {new  Wolf(),new Wolf(),new Duck(),new Penguin(),new Goat(),new Gopher(),new Penguin(),new Fish()};
        int col;
        Enclosure enc[]={new Enclosure<>(demo1[1].enSize),new Enclosure<>(demo1[3].enSize),new Enclosure<>(demo1[4].enSize),new Enclosure<>(demo1[5].enSize),new Enclosure<>(demo1[7].enSize)};

        for (i = 0; i < demo1.length; i++) {
            for (j = 0; j < enc.length; j++){
                if (enc[j].putAnimalToEnclosure(demo1[i])) {
                    System.out.println("Животное " + demo1[i].name + " паспортный номер " + demo1[i].id + " размещено в вольере номер " + j +
                            " размера " + enc[j].sizeOfEnclosure);
                    break;
                }
            }
        }
        Animal an;
        for (j = 0; j < enc.length; j++){
            col=0;
            for (i = 0; i < demo1.length; i++) {
                an=enc[j].getAnimalFromEnclosure(demo1[i].id);
                if (an != null){
                    col=++col;
                    System.out.println("Животное "+an.name+" паспортный номер " + demo1[i].id + " находится в вольере "+j+".");
                }
            }
            System.out.println("В вольере "+ j + " количество животных "+col+".");

        }

        enc[3].removeAnimalFromEnclosure(18);
        enc[3].removeAnimalFromEnclosure(18);

    }
}

