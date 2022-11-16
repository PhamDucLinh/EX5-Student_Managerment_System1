import Model.Student;
import Main.ManagerStudent;
import Utils.Menu;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Student;
import Utils.Validate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        List<Student> studentList = new ArrayList<>();
        ManagerStudent mn = new ManagerStudent(studentList);
        Student st = new Student();
        int choose;
        do {
            menu.Menu();
            do {
                choose = scanner.nextInt();
                if ((choose < 1) || (choose > 4))
                    System.out.println("Enter a number from 1 to 4");
            }
            while ((choose < 1) || (choose > 4));

            switch (choose){
                case 1:
                    mn.addStudent();
                    break;
                case 2:
                    mn.showStudent();
                case 3:

                    String searchst = Validate.getString(scanner,"Enter name: ");
                    mn.search(searchst);
            }
        } while (choose != 4 );

    }
}