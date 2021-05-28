import java.util.LinkedList;

public class UserDefineGenerics {
    public static void main(String[] args) {
//        Team1 team1 = new Team1(new Manager(), new LinkedList<Specialist>());
//        Team2 team2 = new Team2(new Executive(), new LinkedList<Operator>());

//        Team team1 = new Team(new Manager(), new LinkedList<Specialist>());
//        Team team2 = new Team(new Executive(), new LinkedList<Operator>());
//
////        wrong list, but can't shows error
//        Team team3 = new Team(new Specialist(), new LinkedList<Manager>());

        Team<Manager, Specialist> team1 = new Team<>(new Manager(), new LinkedList<Specialist>());
        Team<Executive, Operator> team2 = new Team<>(new Executive(), new LinkedList<Operator>());

//        //  wrong list, but not showing error
//        Team<Operator, Executive> wrongteam1 = new Team<>(new Specialist(), new LinkedList<Manager>());
//        Team<Operator, Executive> wrongteam2 = new Team<>(new Operator(), new LinkedList<Executive>());
//        // we also can create String Type as Leader & Member, but it is also wrong & not showing error
//        Team<String, String> wrongteam3 = new Team<>(new String(),  new LinkedList<String>());
    }
}
