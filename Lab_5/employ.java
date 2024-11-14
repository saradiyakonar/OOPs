package Lab_5;

import java.util.*;
interface Employee{
    public void getDetails(int empid, String empname);
}
interface manager extends Employee{
    public void getDeptDetails(int deptID, String deptName);
}
class Head implements manager{
    public void getDetails(int empid, String empname){
        System.out.println("Employee ID = "+empid);
        System.out.println("Employee Name ="+empname);
    }
    public void getDeptDetails(int deptID, String deptName){
        System.out.println("Department ID ="+deptID);
        System.out.println("Department Name ="+deptName);
    }
}

class employ{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee ID");
        int empid = sc.nextInt();
        System.out.println("Enter Employee Name");
        String empname = sc.next();
        System.out.println("Enter Department ID");
        int deptID = sc.nextInt();
        System.out.println("Enter Department Name");
        String deptName = sc.next();
        Head h1 = new Head();
        h1.getDetails(empid,empname);
        h1.getDeptDetails(deptID,deptName);
    }
}