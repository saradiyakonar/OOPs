package Lab_4;

import java.util.*;
class Account{
    int acc_no;
    double balance;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter your account number");
        acc_no=sc.nextInt();
        System.out.println("Enter your account balance");
        balance=sc.nextDouble();
    }
    void disp(){
        System.out.println("Lab_4.Account number ="+acc_no);
        System.out.println("Lab_4.Account balance ="+balance);
    }
}
class Person extends Account{
    long aadhar;
    String name;
    void input(){
        super.input();
        System.out.println("Enter Name ");
        name = sc.next();
        System.out.println("Enter Aadhar number ");
        aadhar=sc.nextLong();
    }
    void disp(){
        super.disp();
        System.out.println("Aadhar number ="+aadhar);
        System.out.println("Name ="+name);
    }
}
public class Accounting {
    public static void main(String [] args){
        Person[] persons = new Person[3];                       //an array containing the objects of class Lab_4.Person
        for(int i=0; i<3; i++){
            persons[i]=new Person();                           //array persons contains an object of the class Lab_4.Person
            System.out.println("Enter details of Person "+(i+1));
            persons[i].input();
            System.out.println("Details of Person "+(i+1));
            persons[i].disp();
        }
    }
}
