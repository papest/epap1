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
        System.out.println(name+" "+ Run.interfaceName()+"!");
                  }

    @Override
    public void swim() {
        System.out.println(name+" "+ Swim.interfaceName()+"!");

    }
}
