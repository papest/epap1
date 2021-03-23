package animals;


public class Duck extends Cornivorous implements Swim, Voice, Fly, Run {


    public Duck(){
        name="Утка";
        Animal.incrementId();
        id=Animal.idAnimal;
        enSize = EnSize.BIGSIZE;

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
    public void fly() {
        System.out.println(name+" "+ Fly.interfaceName()+"!");
    }

    @Override
    public String voice() {
        voice = "Кря-кря";
        return voice;}
    }

