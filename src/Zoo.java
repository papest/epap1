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
       Swim[] pond ={fish,duck,penguin};
       int i;
       for (i=0; i< 3; i++) {
           pond[i].swim();
       }


       Gopher gopher = new Gopher();
       Beefsteak beefsteak= new Beefsteak();
       food.Hay hay = new food.Hay();
       goat.eat(hay);
       Meatball meatball= new Meatball();
       wolf.eat(meatball);
       Worker.feed(meatball,wolf);
       Worker.getVoice(wolf);
       Worker.getVoice(goat);
       Worker.getVoice(penguin);
       //Worker.getVoice(fish); - ошибка компиляции
       Worker.feed(oats,wolf);
       Worker.feed(oats,goat);
       Worker.feed(hay,gopher);

   }
}
