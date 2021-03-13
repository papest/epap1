package animals;

public class Fish extends Herbivore implements Swim {
    public Fish(){
        name="Рыба";
    }


    @Override
    public void swim() {
        System.out.println(name+" "+ Swim.interfaceName()+"!"); }
    }


