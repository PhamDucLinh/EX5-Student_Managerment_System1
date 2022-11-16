package Main;

import Model.Student;
import Utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();

    public ManagerStudent(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(){
        Student st = new Student();
        st.InputStudent(studentList);
        studentList.add(st);
    }
    public void showStudent(){
        for(Student st : studentList){
            st.Display();
        }
    }
    public void search(String searchst) {
        for(Student st : studentList){
          if(searchst.contains(st.getFullname())){
              st.Display();
          }
          break;
       }
    }
}
