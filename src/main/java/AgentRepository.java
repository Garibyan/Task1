import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class AgentRepository {

    private EntityManager entityManager;

    public AgentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Agent> findById(Integer id) {
        Agent agent = entityManager.find(Agent.class, id);
        return agent != null ? Optional.of(agent) : Optional.empty();
    }
    public List<Agent> findAll() {
        return entityManager.createQuery("from Agent ").getResultList();
    }
}
