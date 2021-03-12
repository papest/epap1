package animals;

public class Goat extends Herbivore implements Voice, Run, Swim {



    @Override
    public void run() {
        System.out.println("Коза бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Коза плывет-пришлось!");
    }

    @Override
    public String voice() {
        return "Ме-мее!";
    }
}

