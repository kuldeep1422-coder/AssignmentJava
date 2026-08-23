package Assignment_4;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student(101,"kuldeep",60.90);
        Student student2=new Student();
        student2.setName("kuldeep");
        student2.setPercentage(80.90);
        student2.setRollNumber(101);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        // student1.StudentCount();
        student1.StudentCount();
        Student student=new Student();
        System.out.println(student.toString());
    
    
    }    
}
