package Marketing;
import General.*;

public class sales extends employee{
    double allowance;
    void tallowance(){
        allowance = 0.50 * earnings;
        System.out.println("Travel Allowance of the employee is "+allowance);
    }
    public static void main(String [] args){
        sales s1 = new sales();
        s1.tallowance();
    }
}
