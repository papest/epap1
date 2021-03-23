package animals;

public class Fish extends Herbivore implements Swim {

    public Fish(){
        name="Рыба";
        Animal.incrementId();
        id=Animal.idAnimal;
        enSize=EnSize.BIGSIZE;

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
    public void swim() {
        System.out.println(name+" "+ Swim.interfaceName()+"!"); }
    }


