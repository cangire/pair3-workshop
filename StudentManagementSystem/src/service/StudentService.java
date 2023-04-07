package service;

import entity.Student;

import java.util.ArrayList;

public class StudentService {
    public ArrayList<Student> studentList;
    public void Add(Student student)
    {
        if(studentList != null) {
            ArrayList<Student> students = new ArrayList<>();
            for(Student student1 : studentList) {
                students.add(student1);

            }
            for (Student student1 : students) {

                if (student1.getNationalityId() !=student.getNationalityId())
                    studentList.add(student);
            }
        }
        else
        {
            studentList=new ArrayList<>();
            studentList.add(student);
        }
    }
    public void List()
    {
        ArrayList<String> studentNames=new ArrayList<>();
        for (Student student : studentList){
            studentNames.add(student.getFirstName());

        }
        System.out.println("Öğrenci listesi: "+studentNames);
    }
    public void Delete(String NationalityId){

        for(Student student1 : studentList){
            if(student1.getNationalityId().equals(NationalityId))
                studentList.remove(student1);
        }

    }
}
