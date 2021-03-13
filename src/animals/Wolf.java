package animals;

public class Wolf extends Cornivorous implements Voice, Run, Swim {

    public Wolf() {
        name="Волк";
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
        return "У-у-у-у!";
    }


    }

