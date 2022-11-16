package Model;

import Interface.IStudent;

import java.util.List;
import java.util.Scanner;

public class Student implements IStudent {
    private String Fullname;
    private int ID;
    private String DateofBirth;
    private String Native;
    private String Classs;
    private String PhoneNo;
    private int Mobie;


    @Override
    public void Display() {
        System.out.println(
                        "Full name: " + this.Fullname + "\t" +
                        "ID: " + this.ID + "\t" +
                        "Date of birth: " + this.DateofBirth + "\t" +
                        "Native: " + this.Native + "\t" +
                        "Class: " + this.Classs + "\t" +
                        "Phone: " + this.PhoneNo + "\t" +
                        "Mobie" + this.Mobie + "\t"
        );
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getNative() {
        return Native;
    }

    public void setNative(String aNative) {
        Native = aNative;
    }

    public String getClasss() {
        return Classs;
    }

    public void setClasss(String classs) {
        Classs = classs;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getMobie() {
        return Mobie;
    }

    public void setMobie(int mobie) {
        Mobie = mobie;
    }

    public void InputStudent(List<Student> StudentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");
        System.out.println("Enter Full name:");
        this.Fullname = scanner.next();
        this.ID = (StudentList.size() > 0) ? (StudentList.size() + 1) : 1;
        System.out.println("Enter date of birth:");
        this.DateofBirth = scanner.next();
        System.out.println("Enter Navtive:");
        this.Native = scanner.next();
        System.out.println("Enter Class:");
        this.Classs = scanner.next();
        System.out.println("Enter phone no:");
        this.PhoneNo = scanner.next();
        System.out.println("Enter mobie:");
        this.Mobie = scanner.nextInt();
    }
}
