package mindcraft.Assgnment_16_17_18;

import java.util.Comparator;

public class PercentageComparator
        implements Comparator<Student> {

    @Override
    public int compare(Student student1,
                       Student student2) {

        return Double.compare(
                student1.getPercentage(),
                student2.getPercentage()
        );
    }
}