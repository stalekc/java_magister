package lr34;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Bureau {
    private HashMap<Customer, Integer> tasks;
    private HashMap<Integer, Integer> cost;
    private HashMap<Constructor, Boolean> team;
    private HashMap<Integer, ArrayList<Constructor>> work_team;

    public Bureau() {
        tasks = new HashMap<>();
        cost = new HashMap<>();
        team = new HashMap<>();
        work_team = new HashMap<>();
    }

    public void add_task(Customer c, int i){
        tasks.put(c, i);
        cost.put(i, ThreadLocalRandom.current().nextInt(10, 1000));
    }

    public void add_to_team(Constructor c){
        team.put(c, true);
    }

    public void create_team(int i){
        work_team.put(i, new ArrayList<>());
        int n = 0;
        for (Map.Entry entry: team.entrySet()){
            if( (Boolean) entry.getValue()) {
                team.put((Constructor) entry.getKey(), false);
                work_team.get(i).add((Constructor) entry.getKey());
                n++;
                if (n == 2){
                    break;
                }
            }
        }
    }

    public void delete_team(int i){
        for (int j = 0; j < work_team.get(i).size(); j++) {
            team.put(work_team.get(i).get(j), true);
        }
        work_team.remove(i);
    }

    @Override
    public String toString() {
        return "Bureau{" +
                "tasks=" + tasks +
                ", cost=" + cost +
                ", team=" + team +
                ", work_team=" + work_team +
                '}';
    }
}
