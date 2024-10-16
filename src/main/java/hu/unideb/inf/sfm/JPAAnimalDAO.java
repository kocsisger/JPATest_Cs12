package hu.unideb.inf.sfm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JPAAnimalDAO implements AnimalDAO{

    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveAnimal(Animal a) {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Animal> getAllAnimals() {
        TypedQuery<Animal> query = entityManager.createQuery(
                "SELECT a FROM Animal a", Animal.class);
        List<Animal> animals = query.getResultList();
        return animals;
    }

    @Override
    public void updateAnimal(Animal a) {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteAnimal(Animal a) {
        entityManager.getTransaction().begin();
        entityManager.remove(a);
        entityManager.getTransaction().commit();
    }
}
