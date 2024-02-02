import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

public class StatisticsTest {

    private Statistics stats;
//Alle unittest har, arrange, act & assert
    @BeforeEach
    public void setUp() {
        //Dummies for testing
        Rider rider1 = new Rider("Rytter A", "Hold 1");
        Rider rider2 = new Rider("Rytter B", "Hold 2");
        Rider rider3 = new Rider("Rytter C", "Hold 1");
        List<Rider> riders = Arrays.asList(rider1, rider2, rider3);
        stats = new Statistics(riders);
    }
    @Test
    public void testGetTeamNames() {
        //Expecting to get a list of unique team names back
        List<String> expectedTeams = Arrays.asList("Hold 1", "Hold 2");
        List<String> actualTeams = stats.getTeamNames();
        assertEquals(expectedTeams.size(), actualTeams.size(), "Antallet af hold stemmer ikke");
        assertTrue(actualTeams.containsAll(expectedTeams), "Listen indeholder ikke de forventede hold");
    }
}
