package Lab3;
import java.util.*;

class Employee implements Comparable<Employee> {
    int id, sal;
    String name, jobTitle, org;
    char gender;
    static int cnt = 0;
    Employee(int id, String name, char gender, String jobTitle, String org, int sal) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.org = org;
        this.sal = sal;
        cnt += 1;
    }
    @Override
    public int compareTo(Employee obj) {
        return this.name.compareTo(obj.name);
    }
    @Override
    public String toString() {
        String s = String.format("ID : "+id+"\nNAME : "+name+"\nGENDER : "+gender+"\nJOB TITLE : "+jobTitle+"\nORGANISATION : "+org+ "\nSALARY : "+sal);
        return s;
    }
}
class help{
    Vector <Employee> empVec;
    help() {
        empVec = new Vector <Employee>();
    }

    void addEmployee() {
        int id, sal;
        char sex;
        String name, jobTitle, org;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = scr.nextInt();
        System.out.println("Enter Name : ");
        name = scr.next();
        System.out.println("Enter Gender : ");
        sex = scr.next().charAt(0);
        System.out.println("Enter Job Title : ");
        jobTitle = scr.next();
        System.out.println("Enter Organization : ");
        org = scr.next();
        System.out.println("Enter Salary : ");
        sal = scr.nextInt();
        Employee emp = new Employee(id, name, sex, jobTitle, org, sal);
        empVec.add(emp);
        System.out.println("Employee added successfully!");
    }
    void deleteEmployee() {
        Scanner scr = new Scanner(System.in);
        int id, t = -1;
        System.out.println("Enter employee id: ");
        id = scr.nextInt();

        for (int i = 0; i < empVec.size(); i++) {
            if (empVec.get(i).id == id) {
                t = i;
                empVec.remove(i);
                break;
            }
        }
        if (t == -1) {
            System.out.println("Employee not found!");
            return;
        }
        System.out.println("Employee deleted!");
    }
    void compare(Employee emp1, Employee emp2) {
        if (emp1.sal > emp2.sal) {
            System.out.println(emp1.name + " earns more!!");
        }
        else if (emp2.sal > emp1.sal) {
            System.out.println(emp2.name + " earns more!!");
        }
        else {
            System.out.println("Both earn equal salary!!");
        }
    }
    void searchEmployee() {
        Scanner scr = new Scanner(System.in);
        int op;
        boolean found = false;
        System.out.println("Press '1' to search by id, '2' to search by name: ");
        op = scr.nextInt();
        switch (op) {
            case 1:
                int id;
                System.out.println("Enter id : ");
                id = scr.nextInt();
                for (int i = 0; i < empVec.size(); i++) {
                    if (empVec.get(i).id == id) {
                        found = true;
                        System.out.println(empVec.get(i));
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("Employee not found!");
                }
                break;
            case 2:
                String name;
                System.out.println("Enter name : ");
                name = scr.next();
                for (int i = 0; i < empVec.size(); i++) {
                    if (empVec.get(i).name.equals(name)) {
                        found = true;
                        System.out.println(empVec.get(i));
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("Employee not found!");
                }
                break;
            default:
                System.out.println("Enter valid option!");
        }
    }
    void dispEmployee() {
        if (empVec.size() == 0) {
            System.out.println("Vector is empty!");
            return;
        }
        for (int i = 0; i < empVec.size(); i++) {
            System.out.println("\nEmployee " + (i + 1) + ": ");
            System.out.println(empVec.get(i));
        }
        System.out.println("All employees displayed!");
    }
    void run() {
        Scanner scr = new Scanner(System.in);
        int op;
        System.out.println("MENU");
        System.out.println("Press 1 to Add employee \nPress 2 to delete an employee \nPress 3 to compare 2 employees(by salary)");
        System.out.println("Press 4 to Search employee \nPress 5 to sort by name \nPress 6 to display employee vector ");
        System.out.println("Press 7 to exit");
        boolean flag = true;
        while (flag) {
            System.out.println("Enter choice : ");
            op = scr.nextInt();
            switch (op) {
                case 1:addEmployee();break;
                case 2:deleteEmployee();break;
                case 3:int idx1, idx2;
                    System.out.println("Enter index of employee 1 and employee 2 (starting from '0'): ");
                    idx1 = scr.nextInt();
                    idx2 = scr.nextInt();
                    if (idx1 >= empVec.size() || idx2 >= empVec.size()) {
                        System.out.println("Invalid index!");
                    } else {
                        compare(empVec.get(idx1), empVec.get(idx2));
                    }break;
                case 4:searchEmployee();break;
                case 5:Collections.sort(empVec);
                    System.out.println("Sorted!");
                    break;
                case 6:dispEmployee();break;
                case 7:flag = false;break;
                default:System.out.println("Enter valid option!");
            }
            System.out.println("------------------------------------------------------------------------------------");
        }
    }
}
public class empl {
    public static void main(String[] args) {
        help obj = new help();
        obj.run();
    }
}
