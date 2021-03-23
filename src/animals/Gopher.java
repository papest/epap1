package animals;

public class Gopher extends Herbivore implements Voice, Run, Swim {


    public Gopher(){
        name="Суслик";
        Animal.incrementId();
        id=Animal.idAnimal;
        enSize = EnSize.LITTLESIZE;
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
        return "С-И-и!";
    }
}
