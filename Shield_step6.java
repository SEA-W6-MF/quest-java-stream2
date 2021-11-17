import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Shield_step6 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        // use lambda on the call of a functional interface
        // Armanization of step5
        List<Agent> agents = names.stream()
                .map(item -> item.split(" "))
                .map(babyAgent -> new Agent(babyAgent[0], babyAgent[1]))
                .collect(Collectors.toList());

        showAgents(agents);
    }

    /* private static List<Agent> map(List<String> names, Function<String, Agent> split) {
        List<Agent> agents = new ArrayList<>();

        for (String item : names) {
            agents.add(split.apply(item));
        }
        return agents;
    } */

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