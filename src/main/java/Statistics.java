import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Statistics {
    private List<Rider> riders;

    public Statistics(List<Rider> riders) {
        this.riders = riders;
    }


    public List<String> getTeamNames() {
        return riders.stream().map(Rider::getTeam).distinct().collect(Collectors.toList()); // Lambda
    }
}



