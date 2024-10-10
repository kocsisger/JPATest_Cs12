package hu.unideb.inf.sfm;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Customer customer = new Customer();
        customer.setFirstName("Dennys");
        customer.setLastName("Fredericci");

        Animal ellyElephant = new Animal("Elly", 9, Animal.GenderType.FEMALE);

        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.persist(ellyElephant);
        entityManager.getTransaction().commit();
    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
