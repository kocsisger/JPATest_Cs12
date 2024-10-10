package hu.unideb.inf.sfm;

import java.util.List;

public interface AnimalDAO {
    public void saveAnimal(Animal a);       //C
    public List<Animal> getAllAnimals();    //R
    public void updateAnimal(Animal a);     //U
    public void deleteAnimal(Animal a);     //D
}
