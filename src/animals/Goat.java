package animals;

public class Goat extends Herbivore implements Voice, Run, Swim {

    public Goat() {
        name="Коза";
    }

    @Override
    public void run() {
        System.out.println(name+" "+ Run.interfaceName()+"!");
    }

    @Override
    public void swim() {
        System.out.println(name+" "+ Swim.interfaceName()+"!");
    }

    @Override
    public String voice() {
        return "Ме-мее!";
    }
}

