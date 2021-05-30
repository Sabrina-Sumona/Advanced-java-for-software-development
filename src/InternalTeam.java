import java.util.List;

public class InternalTeam implements Teams<Manager, Specialist> {
    Manager leader;
    List<Specialist> members;

    public InternalTeam(Manager leader, List<Specialist> members) {
        this.leader = leader;
        this.members = members;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Manager getLeader() {
        return leader;
    }

    @Override
    public void setLeader(Manager leader) {
        this.leader = leader;
    }

    @Override
    public List<Specialist> getMembers() {
        return members;
    }

    @Override
    public void setMembers(List<Specialist> members) {
        this.members = members;
    }

    public void umInernalT () {
        System.out.println("Unique method for internal team");
    }
}
