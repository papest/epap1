package animals;


public class Penguin extends Cornivorous implements Voice, Run, Swim {

    public Penguin(){
        name="Пингвин";
    }


    @Override
    public String voice() {
        return  "Ээ-а-у!";
                  }

    @Override
    public void run() {
        System.out.println("Пингвин ковыляет!");
                  }

    @Override
    public void swim() {
        System.out.println("Пингвин плывет!");

    }
}
