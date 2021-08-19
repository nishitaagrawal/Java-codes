package Lab3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class dob{
    int d,m,y;
    Scanner sc = new Scanner(System.in);
    dob() {
        this.d = 0;
        this.m = 0;
        this.y = 0000;
    }
    dob(int day, int month, int yr) {
        this.d = day;
        this.m = month;
        this.y = yr;
    }
    public void get_dob() {
        System.out.println("Enter date, month, year (with spaces) : ");
        this.d = sc.nextInt();
        this.m = sc.nextInt();
        this.y = sc.nextInt();
    }
    String disp_dob() {
        String s = String.format("DOB : "+ this.d+"/"+ this.m+"/"+ this.y);
        return s;
    }
}
class student implements Comparable<student>{
    Scanner sc=new Scanner(System.in);
    dob db;
    int prn;
    String s;
    int sub;
    int marks;
    String name;

    student(String name, int prn, int mks, int day, int month, int yr) {
        this.name = name;
        this.prn = prn;
        this.marks = mks;
        db = new dob(day, month, yr);
    }

    @Override
    public int compareTo(student obj) {
        return this.marks - obj.marks;
    }

    @Override
    public String toString() {
        String s1 = String.format("NAME: "+this.name +"\nPRN: "+this.prn+"\nMARKS : "+this.marks);
        String s2 = "\nBirthday details: \n" + db.disp_dob();
        return s1 + s2;
    }
    public void get_mark(){
        System.out.println("Enter marks ");
        marks=sc.nextInt();
    }
   char getGrade() {
       char grade;
       if (this.marks >= 81) {
           grade = 'A';
       } else if (this.marks >= 61 && this.marks < 81) {
           grade = 'B';
       } else if (this.marks >= 41 && this.marks < 61) {
           grade = 'C';
       } else {
           grade = 'F';
       }
       return grade;
   }
}

class helpclass{
    ArrayList <student> st;
    helpclass() {
        st = new ArrayList <student>();
    }

    void get_details() {
        student stud;
        String name;
        int prn, mks, day, month, yr;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        name = scr.next();
        System.out.println("Enter the prn of student: ");
        prn = scr.nextInt();
        System.out.println("Enter the marks of the student: ");
        mks = scr.nextInt();
        System.out.println("Enter the birth date in 'Date Month Year' format separated by spaces: ");
        day = scr.nextInt();
        month = scr.nextInt();
        yr = scr.nextInt();
        stud = new student(name, prn, mks,day, month, yr);
        st.add(stud);
        Collections.sort(st);
        System.out.println("Student added successfully!");
    }
    void display_details() {
        if (st.size() == 0) {
            System.out.println("List empty!");
            return;
        }
        for (int i = 0; i < st.size(); i++) {
            System.out.println("\nStudent " + (i + 1) + ": ");
            System.out.println(st.get(i));
        }
        System.out.println("All students displayed (in sorted manner) !!!");
    }
    void get_grade(){
        for (int i = 0; i < st.size(); i++) {
            get_grade();
        }
    }
    void searchStudent() {
        Scanner scr = new Scanner(System.in);
        int op;
        System.out.println("Enter '1' to search by prn, '2' to search by name, '3' to search by index");
        op = scr.nextInt();

        switch (op) {
            case 1:
                int prn;
                System.out.println("Enter prn: ");
                prn = scr.nextInt();
                for (student s: st) {
                    if (s.prn == prn) {
                        System.out.println(s);
                        return;
                    }
                }
                System.out.println("Student not found!");
                break;

            case 2:
                String name;
                System.out.println("Enter name: ");
                name = scr.next();
                for (student s: st) {
                    if (name.equals(s.name)) {
                        System.out.println(s);
                        return;
                    }
                }
                System.out.println("Student not found!");
                break;

            case 3:
                int idx;
                System.out.println("Enter index (starting from '0'): ");
                idx = scr.nextInt();

                if (idx >= st.size()) {
                    System.out.println("Enter valid index!");
                } else {
                    System.out.println(st.get(idx));
                }
                break;

            default:
                System.out.println("Enter valid option number!");
                break;
        }
    }
    void updateStudent() {
        Scanner scr = new Scanner(System.in);
        int prn;
        System.out.println("Enter prn: ");
        prn = scr.nextInt();
        int tgt = -1;
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).prn == prn) {
                tgt = i;
                break;
            }
        }
        if (tgt == -1) {
            System.out.println("Student not found!");
        }
        else {
            String name;
            int mks, day, month, yr;
            System.out.println("Enter the name of the student: ");
            name = scr.next();
            st.get(tgt).name = name;
            System.out.println("Enter the marks of the student: ");
            mks = scr.nextInt();
            st.get(tgt).marks = mks;
            System.out.println("Enter the birth date in 'Date Month Year' format separated by spaces: ");
            day = scr.nextInt();
            st.get(tgt).db.d = day;
            month = scr.nextInt();
            st.get(tgt).db.m = month;
            yr = scr.nextInt();
            st.get(tgt).db.y = yr;
            System.out.println("Updated!");
            Collections.sort(st);
        }
    }
    void deleteStudent() {
        Scanner scr = new Scanner(System.in);
        int prn;
        System.out.println("Enter prn: ");
        prn = scr.nextInt();
        boolean flag = false;

        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).prn == prn) {
                st.remove(i);
                System.out.println("Student removed!");
                flag = true;
                Collections.sort(st);
                break;
            }
        }
        if (flag == false) {
            System.out.println("Student not found!");
        }
    }
    void run() {
        Scanner scr = new Scanner(System.in);
        int op;
        System.out.println("MENU \nPress 1 to add student \nPress 2 to display student list ");
        System.out.println("Press 3 to Search student list \nPress 4 to update student list");
        System.out.println("Press 5 to Delete student list \nPress 6 to get grades \nPress 7 to exit");
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice : ");
            op = scr.nextInt();
            switch (op) {
                case 1:
                    get_details();
                    break;

                case 2:
                    display_details();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;
                case 6:System.out.println("Name        Marks       Grade");
                    for (student obj: st) {
                        char grade =obj.getGrade();
                        System.out.println(obj.name + "        " + obj.marks + "      " + grade);
                    }
                    break;

                case 7:
                    flag = false;
                    break;

                default:
                    System.out.println("Enter valid option!");
            }
            System.out.println("------------------------------------------------------------------------------------");
        }

    }
}
public class students {
    public static void main(String[] args) {
        helpclass obj = new helpclass();
        obj.run();
    }
}