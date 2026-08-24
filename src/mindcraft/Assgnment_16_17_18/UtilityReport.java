package mindcraft.Assgnment_16_17_18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilityReport {

    private Map<String, Double> m;

    // Constructor
    public UtilityReport() {

        m = new HashMap<>();
    }

    // Show report
    public void showReport(List<Student> list) {

        for (Student student : list) {

            m.put(
                    student.getName(),
                    student.getPercentage()
            );
        }

        System.out.println("\n----- Student Report -----");

        for (Map.Entry<String, Double> entry : m.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " --> "
                            + entry.getValue()
            );
        }
    }
}