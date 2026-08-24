package mindcraft.Assgnment_16_17_18;

import java.util.Set;

public class Student implements Comparable<Student> {

    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;

    // Constructor
    public Student(int rollno, String name,
                   double percentage,
                   Set<String> skillset) {

        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skillset;
    }

    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public Set<String> getSkillset() {
        return skillset;
    }

    // Setters
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    // Comparable
    // Sort according to percentage
    @Override
    public int compareTo(Student student) {

        return Double.compare(
                this.percentage,
                student.percentage
        );
    }

    // toString
    @Override
    public String toString() {

        return "Student [rollno=" + rollno
                + ", name=" + name
                + ", percentage=" + percentage
                + ", skillset=" + skillset
                + "]";
    }
}