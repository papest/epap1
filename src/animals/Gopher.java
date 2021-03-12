package animals;

public class Gopher extends Herbivore implements Voice, Run, Swim {


    public Gopher(){  voice=this.voice();}



    @Override
    public void run() {
        System.out.println("Суслик бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Где ж тут плавать суслику!");
    }

    @Override
    public String voice() {
        return "С-И-и!";
    }
}
