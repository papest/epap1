package animals;


public class Duck extends Cornivorous implements Swim, Voice, Fly, Run {

    public Duck(){
        name="Утка";
    }


    @Override
    public void run() {
        System.out.println("Утка бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет!");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит!");
    }

    @Override
    public String voice() {
        voice = "Кря-кря";
        return voice;}
    }

