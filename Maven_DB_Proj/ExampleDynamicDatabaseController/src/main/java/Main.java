import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Account account = new Account();
        account.setId(41);
        account.setEmail("xx@gmail.com");
        account.setName("Shane");
        account.setUsername("MarkyMark");
        account.setPassword("1234abc");



        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(account);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }

}
