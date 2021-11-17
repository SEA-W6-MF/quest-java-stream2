import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Shield_step4 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        // substitute interface Split with functional interface Function
        List<Agent> agents = map(names, new Function<String, Agent>() {
            @Override
            public Agent apply(String item) {
                String[] temp = item.split(" ");
                Agent agent = new Agent(temp[0], temp[1]);
                return agent;
            }
        });

        showAgents(agents);
    }

    private static List<Agent> map(List<String> names, Function<String, Agent> split) {
        List<Agent> agents = new ArrayList<>();

        for (String item: names) {
            agents.add(split.apply(item));
        }
        return agents;
    }

    /* private interface Split {
        Agent apply(String item);
    }*/


    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}