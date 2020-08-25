import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("FirstTask");
        EntityManager entityManager = factory.createEntityManager();
        UserRepository userRepository = new UserRepository(entityManager);
        AgentRepository agentRepository = new AgentRepository(entityManager);

        Object y = userRepository.findById(1);
        Object x = agentRepository.findById(1);

        List usersList = new ArrayList(userRepository.findAll());
        List usersaaList = new ArrayList(agentRepository.findAll());

        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();

    }

}
