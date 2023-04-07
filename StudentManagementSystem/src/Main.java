import entity.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
StudentService studentManager=new StudentService();
Student student=new Student("Can","Gire",120,"332312324242342","1A");
Student student1=new Student("Yaşar","Gire",120,"33231232424234","1A");
studentManager.Add(student);
studentManager.Add(student1);

        studentManager.List();
        studentManager.Delete("332312324242342");
        studentManager.List();
    }
}