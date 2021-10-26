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

    std1.setId(1);
    std1.setName("Susanthika");
    std1.setAddress(" Embilipitiya");
    std1.setDob(Date.valueOf("1996-03-20"));
    std1.setGender(" Female");
    std1.setSubject(new Subject(89, 20));

    std2.setId(2);
    std2.setName("Thilini");
    std2.setAddress(" Kurunegala");
    std2.setDob(Date.valueOf("1997-01-31"));
    std2.setGender("Female");
    std2.setSubject(new Subject(77, 65));

    std3.setId(3);
    std3.setName("Tharushi");
    std3.setAddress("Colombo");
    std3.setDob(Date.valueOf("1998-09-23"));
    std3.setGender("Female");
    std3.setSubject(new Subject(56, 48));

    std4.setId(4);
    std4.setName("Tharindu");
    std4.setAddress("Mathale");
    std4.setDob(Date.valueOf("1994-07-23"));
    std4.setGender("Male");
    std4.setSubject(new Subject(76, 65));

    std5.setId(5);
    std5.setName("Kavinga");
    std5.setAddress(" Jaffna");
    std5.setDob(Date.valueOf("2000-04-29"));
    std5.setGender("Male");
    std4.setSubject(new Subject(46, 38));

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
    System.out.println(
        "ID " + "Name " + "       Address" + "           DOB " + "             Gender" + "          calcAge" + "\n");
    for (Student S : S1) {
      System.out.println(S.getId() + "  " + S.getName() + "      " + S.getAddress() + "         " + S.getDob()
          + "         " + S.getGender() + "       " + calcAge.getAge(S.getDob()));

      if (topStudent != null) {

        StudentFunction studentFunc = new StudentFunction();

        // Subject subject = new Subject(10, 29);

        println("Student Details : ");
        println("-----------------------");
        println("Student Id : " + topStudent.getId());
        println("Name : " + topStudent.getName() + "\n");
        println("Subject" + "        " + "Grade");
        println("Maths  " + "       " + studentFunc.getMathstMarks(topStudent.getSubject().getMaths()));
        println("Sinhala  " + "     " + studentFunc.getSinhalaMarks(topStudent.getSubject().getSinhala()));

      }
    }
  }
}
