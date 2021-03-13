package animals;


public class Duck extends Cornivorous implements Swim, Voice, Fly, Run {

    public Duck(){
        name="Утка";
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
    public void fly() {
        System.out.println(name+" "+ Fly.interfaceName()+"!");
    }

    @Override
    public String voice() {
        voice = "Кря-кря";
        return voice;}
    }

