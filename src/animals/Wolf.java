package animals;

public class Wolf extends Cornivorous implements Voice, Run, Swim {

    public Wolf() {
        name="Волк";
        Animal.incrementId();
        id=Animal.idAnimal;
        enSize= EnSize.SUPERBIGSIZE;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
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

