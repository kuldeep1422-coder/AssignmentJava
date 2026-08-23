package mindcraft.Assgnment_16_17_18;

import java.util.Set;

public class Student {
    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;


    public Student(String name, double percentage, int rollno, Set<String> skillset) {
        this.name = name;
        this.percentage = percentage;
        this.rollno = rollno;
        this.skillset = skillset;
    }

    public Student() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Set<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rollno=").append(rollno);
        sb.append(", percentage=").append(percentage);
        sb.append(", skillset=").append(skillset);
        sb.append('}');
        return sb.toString();
    }
}
