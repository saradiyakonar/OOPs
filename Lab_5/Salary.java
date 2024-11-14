package Lab_5;
import java.util.*;
interface Sal{
    void earnings(double basic);
    void deductions(double basic);
    void bonus(double basic);
}
abstract class Manager implements Sal{
    public void earnings(double basic){
        double earnings = basic + (0.8*basic)+ (0.15*basic);
        System.out.println("Earnings ="+earnings);
    }
    public void deductions(double basic){
        double ded = (0.12*basic);
        System.out.println("Deductions ="+ded);
    }
}
class Substaff extends Manager{
    public void bonus(double basic){
        double bonus = (0.50*basic);
        System.out.println("Bonus ="+bonus);
    }
}

class Salary{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic = sc.nextDouble();
        Substaff s  = new Substaff();
        s.earnings(basic);
        s.deductions(basic);
        s.bonus(basic);
    }
}