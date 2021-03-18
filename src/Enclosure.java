
import animals.Cornivorous;
import animals.EnSize;
import animals.Herbivore;

import java.util.HashMap;





public class Enclosure<T> {

    public EnSize sizeOfEnclosure;
    HashMap<Integer, Cornivorous> hashmap1;
    HashMap<Integer, Herbivore> hashmap2;

    public <Cornivorous> Enclosure(EnSize enSize, Class<animals.Cornivorous> cornivorousClass) {
        sizeOfEnclosure = enSize;
        this.hashmap1 = new HashMap<Integer, animals.Cornivorous>();
        this.<Cornivorous>enclosure(sizeOfEnclosure);
    }

    public <Herbivore> Enclosure(EnSize enSize) {
        sizeOfEnclosure = enSize;
        this.<Herbivore>enclosure(sizeOfEnclosure);
        this.hashmap2 = new HashMap<Integer, animals.Herbivore>();
    }


    public void enclosure(EnSize enSize) {

        this.sizeOfEnclosure = enSize;

        //System.out.println("Создан вольер " + this.sizeOfEnclosure +this.hashmap2+ "!");
        System.out.println("Создан вольер " + this.sizeOfEnclosure + "!");
    }


    public boolean putAnimalToEnclosure(Cornivorous cornivorous) {
        System.out.println(" putAnimalToEnclosure" + this.sizeOfEnclosure + " " + cornivorous.enSize);

        if (this.sizeOfEnclosure.equals(cornivorous.enSize)) {
            System.out.println("Вольер подходит.");
            if (this.hashmap1 == null) {
                this.hashmap1 = new HashMap<>();
                this.hashmap1.put(cornivorous.id, cornivorous);
                return true;
            } else if (!hashmap1.containsKey(cornivorous.id)) {
                this.hashmap1.put(cornivorous.id, cornivorous);
                System.out.println("Животное " + cornivorous.name + " размещено.");
                return true;
            } else {
                System.out.println("Животное " + cornivorous.name + " номер в зоопарке " + cornivorous.id + "уже в вольере.");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean putAnimalToEnclosure(Herbivore herbivore) {
        System.out.println(" putAnimalToEnclosure" + this.sizeOfEnclosure + " " + herbivore.enSize);
        //if (enclosure.sizeOfEnclosure == EnSize.LITTLESIZE) {
        if (this.sizeOfEnclosure.equals(herbivore.enSize)) {
            System.out.println("Вольер подходит.");
            if (!hashmap2.containsKey(herbivore.id)) {
                this.hashmap2.put(herbivore.id, herbivore);

                System.out.println("Животное " + herbivore.name + " размещено.");
                return true;
            } else {
                System.out.println("Животное " + herbivore.name + " номер в зоопарке " + herbivore.id + "уже в вольере.");
                return false;
            }
        } else {
            return false;
        }
    }


    public boolean removeAnimalFromEnclosure(Cornivorous cornivorous) {

        if (this.hashmap1.containsKey(cornivorous.id)) {
            this.hashmap1.remove(cornivorous.id);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAnimalFromEnclosure(Herbivore herbivore) {

        if (this.hashmap2.containsKey(herbivore.id)) {
            this.hashmap2.remove(herbivore.id);
            return true;
        } else {
            return false;
        }

    }

    public Herbivore getAnimalFromEnclosure(Herbivore herbivore) {

        if (this.hashmap2.containsKey(herbivore.id)) {
            return this.hashmap2.get(herbivore.id);
        } else {
            return null;
        }

    }

    public Cornivorous getAnimalFromEnclosure(Cornivorous cornivorous) {
        if (this.hashmap1.containsKey(cornivorous.id)) {
            return this.hashmap1.get(cornivorous.id);
        } else {
            return null;
        }

    }
}



   
  


