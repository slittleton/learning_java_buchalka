import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addteam(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(this.league);
        for (T t : league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }

    }

}
