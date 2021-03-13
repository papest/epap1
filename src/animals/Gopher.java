package animals;

public class Gopher extends Herbivore implements Voice, Run, Swim {


    public Gopher(){
        name="Суслик";
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
        return "С-И-и!";
    }
}
