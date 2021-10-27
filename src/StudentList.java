import java.text.ParseException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class StudentList {
  private static void println(String message) {
    System.out.println(message);
  }

  public static void main(String[] args) throws ParseException {

    List<Student> S1 = new ArrayList<Student>();

    Student std1 = new Student();

    Student std2 = new Student();

    Student std3 = new Student();

    Student std4 = new Student();

    Student std5 = new Student();

    StudentFunction calcAge = new StudentFunction();
    // StudentFunction calcGrade = new StudentFunction();

    ArrayList<Subject> st1Subjs = new ArrayList<Subject>();

    std1.setId(1);
    std1.setName("Susanthika");
    std1.setAddress(" Embilipitiya");
    std1.setDob(Date.valueOf("1996-03-20"));
    std1.setGender(" Female");
    st1Subjs.add(new Subject("Maths", 50));
    st1Subjs.add(new Subject("Sinhala", 68));
    std1.setSubjects(st1Subjs);

    ArrayList<Subject> st2Subjs = new ArrayList<Subject>();

    std2.setId(2);
    std2.setName("Thilini");
    std2.setAddress(" Kurunegala");
    std2.setDob(Date.valueOf("1997-01-31"));
    std2.setGender("Female");
    st2Subjs.add(new Subject("Maths", 70));
    st2Subjs.add(new Subject("Sinhala", 38));
    std2.setSubjects(st2Subjs);

    ArrayList<Subject> st3Subjs = new ArrayList<Subject>();

    std3.setId(3);
    std3.setName("Tharushi");
    std3.setAddress("Colombo");
    std3.setDob(Date.valueOf("1998-09-23"));
    std3.setGender("Female");
    st3Subjs.add(new Subject("Maths", 79));
    st3Subjs.add(new Subject("Sinhala", 18));
    std3.setSubjects(st3Subjs);

    ArrayList<Subject> st4Subjs = new ArrayList<Subject>();

    std4.setId(4);
    std4.setName("Tharindu");
    std4.setAddress("Mathale");
    std4.setDob(Date.valueOf("1994-07-23"));
    std4.setGender("Male");
    st4Subjs.add(new Subject("Maths", 49));
    st4Subjs.add(new Subject("Sinhala", 38));
    std4.setSubjects(st4Subjs);

    ArrayList<Subject> st5Subjs = new ArrayList<Subject>();

    std5.setId(5);
    std5.setName("Kavinga");
    std5.setAddress(" Jaffna");
    std5.setDob(Date.valueOf("2000-04-29"));
    std5.setGender("Male");
    st5Subjs.add(new Subject("Maths", 69));
    st5Subjs.add(new Subject("Sinhala", 28));
    std5.setSubjects(st5Subjs);

    S1.add(std1);
    S1.add(std2);
    S1.add(std3);
    S1.add(std4);
    S1.add(std5);
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter student Id: ");
    int number = SC.nextInt();

    Student topStudent = null;

    for (int i = 0; i < S1.size(); i++) {
      if (S1.get(i).getId() == number) {
        topStudent = S1.get(i);
      }
    }

    if (topStudent != null) {
      System.out.println(
          "ID " + "Name " + "       Address" + "           DOB " + "             Gender" + "          calcAge" + "\n");

      System.out.println(topStudent.getId() + "  " + topStudent.getName() + "      " + topStudent.getAddress()
          + "         " + topStudent.getDob() + "         " + topStudent.getGender() + "       "
          + calcAge.getAge(topStudent.getDob()));

      StudentFunction studentFunc = new StudentFunction();

      // Subject subject = new Subject(10, 29);

      println("Student Details : ");
      println("-----------------------");
      println("Student Id : " + topStudent.getId());
      println("Name : " + topStudent.getName() + "\n");
      println("Subject" + "        " + "Grade");

      topStudent.getSubjects().forEach(subject -> {
        println(subject.getName() + " " + "       " + studentFunc.getGrade(subject.getMarks()));
      });

    } else {
      println("Invalid Student ID");
    }

  }
}
