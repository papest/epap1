package animals;

public class Wolf extends Cornivorous implements Voice, Run, Swim {



    public Wolf(){  voice=this.Voice();}
    String Voice() {
            voice = "У-у-у-у!";
            return voice;
    }

    @Override
    public void run() {
        System.out.println("Волк бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Волк плывет!");
    }

    @Override
    public String voice() {
        return "У-у-у-у!";
    }
}
