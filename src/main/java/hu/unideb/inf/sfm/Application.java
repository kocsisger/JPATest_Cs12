package hu.unideb.inf.sfm;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();

       /* Customer customer = new Customer();
        customer.setFirstName("Dennys");
        customer.setLastName("Fredericci");
        entityManager.persist(customer);
        */

        Animal ellyElephant = new Animal("Elly", 9, Animal.GenderType.FEMALE);

        AnimalDAO aDAO = new JPAAnimalDAO();
        aDAO.saveAnimal(ellyElephant);
    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
