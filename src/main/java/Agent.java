import javax.persistence.*;

@Entity
@Table(name = "AGENTS")
public class Agent {

    @Column(name = "AGENT_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "AGENT_FIRSTNAME")
    private String firstName;

    @Column(name = "AGENT_LASTNAME")
    private String lastName;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
