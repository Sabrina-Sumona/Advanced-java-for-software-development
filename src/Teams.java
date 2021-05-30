import java.util.List;

// Generic interface
public interface Teams<L extends Employee & TeamLeader, M extends Employee> {

    L getLeader();

    void setLeader(L leader);

    List<M> getMembers();

    void setMembers(List<M> members);

}