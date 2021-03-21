package animals;


public class Penguin extends Cornivorous implements Voice, Run, Swim {
    public EnSize enSize= EnSize.BIGSIZE;
    final public Integer id;

    public Penguin(){
        name="Пингвин";
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
    public String voice() {
        return  "Ээ-а-у!";
                  }

    @Override
    public void run() {
        System.out.println(name+" "+ Run.interfaceName()+"!");
                  }

    @Override
    public void swim() {
        System.out.println(name+" "+ Swim.interfaceName()+"!");

    }
}
