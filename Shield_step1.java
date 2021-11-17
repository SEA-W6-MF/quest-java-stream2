import java.util.ArrayList;
import java.util.List;

public class Shield_step1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        // Iteration
        List<Agent> agents = new ArrayList<>();
        for (String item: names) {
            String[] temp = item.split(" ");
            Agent agent = new Agent(temp[0], temp[1]);
            agents.add(agent);
        }

        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}