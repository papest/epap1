package animals;

public class Fish extends Herbivore implements Swim {
    public EnSize enSize=EnSize.MIDDLESIZE;
    final public Integer id;
    public Fish(){
        name="Рыба";
        Animal.incrementId();
        id=Animal.idAnimal;

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


