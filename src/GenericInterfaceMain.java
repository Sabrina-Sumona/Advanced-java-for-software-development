import java.util.LinkedList;

public class GenericInterfaceMain {
    public static void main(String[] args) {
//        LinkedList<>() is by default LinkedList<Specialist>()
        Teams<Manager, Specialist> internalTeam0 = new InternalTeam(new Manager(), new LinkedList<>());
//        internalTeam0.umInernalT();
        internalTeam0.getLeader();
        internalTeam0.getMembers();

        InternalTeam internalTeam1 = new InternalTeam(new Manager(), new LinkedList<>());
        internalTeam1.umInernalT();
        internalTeam1.getLeader();
        internalTeam1.getMembers();

        Teams<Manager, Specialist> externalTeam0 = new ExternalTeam(new Manager(), new LinkedList<Specialist>());
//        externalTeam0 .umExternalT();
        externalTeam0 .getLeader();
        externalTeam0 .getMembers();

        Teams<Executive, Operator> externalteam1 = new ExternalTeam(new Executive(), new LinkedList<Operator>());
//        externalteam1.umExternalT();
        externalteam1.getLeader();
        externalteam1.getMembers();
//        externalteam2.setExternals(new LinkedList<>());

        ExternalTeam<Manager, Specialist, External> externalteam2 = new ExternalTeam(new Manager(), new LinkedList<Specialist>());
        externalteam2.umExternalT();
        externalteam2.getLeader();
        externalteam2.getMembers();
        externalteam2.setExternals(new LinkedList<>());

        ExternalTeam<Executive, Operator, External> externalteam3 = new ExternalTeam(new Executive(), new LinkedList<Operator>());
        externalteam3.umExternalT();
        externalteam3.getLeader();
        externalteam3.getMembers();
        externalteam3.setExternals(new LinkedList<>());

        ExternalTeam<Executive, Operator, PartTimer> externalteam4 = new ExternalTeam(new Executive(), new LinkedList<Operator>());
        externalteam4.umExternalT();
        externalteam4.getLeader();
        externalteam4.getMembers();
        externalteam4.setExternals(new LinkedList<PartTimer>());

        ExternalTeam<Executive, Operator, Intern> externalteam5 = new ExternalTeam(new Executive(), new LinkedList<Operator>());
        externalteam5.umExternalT();
        externalteam5.getLeader();
        externalteam5.getMembers();
        externalteam5.setExternals(new LinkedList<Intern>());
    }
}
