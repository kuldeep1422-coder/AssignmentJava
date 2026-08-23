package Assignment_7;

public class Test {

    public static void main(String[] args) {

      Student student=new Student();
      student.accept();
      System.out.println(student.toString());

      System.out.println();

      Date bDate = new Date(14,11,2006);

      Student student1=new Student("rakesh",bDate);
      System.out.println(student1);

    }
}