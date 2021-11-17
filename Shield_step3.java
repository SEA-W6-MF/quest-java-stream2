import java.util.ArrayList;
import java.util.List;

public class Shield_step3 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        // Create transformation interface "Split" and instanciate anonymous class via "new Split"
        List<Agent> agents = map(names, new Split() {
            @Override
            public Agent apply(String item) {
                String[] temp = item.split(" ");
                Agent agent = new Agent(temp[0], temp[1]);
                return agent;
            }
        });

        showAgents(agents);
    }

    private static List<Agent> map(List<String> names, Split split) {
        List<Agent> agents = new ArrayList<>();

        for (String item: names) {
            agents.add(split.apply(item));
        }
        return agents;
    }

    private interface Split {
        Agent apply(String item);
    }


    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}
