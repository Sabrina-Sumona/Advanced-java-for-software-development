import java.util.List;

public class ExternalTeam<L extends Employee & TeamLeader, M extends Employee, E extends External > implements Teams<L , M> {
    L leader;
    List<M> members;
    List<E> externals;

    public List<E> getExternals() {
        return externals;
    }

    public void setExternals(List<E> externals) {
        this.externals = externals;
    }

    public ExternalTeam(L leader, List<M> members) {
        this.leader = leader;
        this.members = members;
    }

    @Override
    public L getLeader() {
        return leader;
    }

    @Override
    public void setLeader(L leader) {
        this.leader = leader;
    }

    @Override
    public List<M> getMembers() {
        return members;
    }

    @Override
    public void setMembers(List<M> members) {
        this.members = members;
    }

    public void umExternalT () {
        System.out.println("Unique method for external team");
    }
}

