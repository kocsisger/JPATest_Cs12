package hu.unideb.inf.sfm;

public class AnimalUtils {
    private AnimalDAO aDAO;

    public AnimalUtils(AnimalDAO aDAO) {
        this.aDAO = aDAO;
    }

    public void runUtils(){
        Animal ellyElephant = new Animal("Elly", 9, Animal.GenderType.FEMALE);
        Zoo zoo = new Zoo("Debrecen zoo");
        ellyElephant.setOwnerZoo(zoo);

        aDAO.saveAnimal(ellyElephant);
    }
}
