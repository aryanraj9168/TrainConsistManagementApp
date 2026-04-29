import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS - UseCase8TrainConsistMgmnt
 * =========================================================
 * * Use Case 8: Sort Bogie Names (TreeMap & SortedMap)
 * * Description:
 * This class maintains a mapping of bogies to their 
 * capacities, automatically sorting them by name.
 * * At this stage, the application:
 * - Creates a TreeMap for automatic key sorting
 * - Inserts capacity values for each bogie
 * - Displays bogies in alphabetical order
 * * This maps natural ordering of keys using TreeMap.
 * * @author Developer
 * @version 8.0
 */
public class UseCase8TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC8 - Sort Bogie Names (TreeMap & SortedMap) ");
        System.out.println("==============================================\n");

        // Create a TreeMap (implements SortedMap)
        // TreeMap automatically sorts entries based on the natural order of keys
        SortedMap<String, Integer> sortedCapacityMap = new TreeMap<>();

        // ---- Insert bogie capacities ----
        sortedCapacityMap.put("Sleeper", 72);
        sortedCapacityMap.put("AC Chair", 56);
        sortedCapacityMap.put("First Class", 24);
        sortedCapacityMap.put("Cargo", 120);
        sortedCapacityMap.put("General", 90);

        System.out.println("Bogie Capacity Details (Sorted Alphabetically by Name):");

        // Iterate through the sorted map
        for (Map.Entry<String, Integer> entry : sortedCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("UC8 alphabetical key sorting completed...");
    }
}
