package Lab_7;

class Arithmetic{
    public static void main(String [] args){
        try{
            int x=0;
            int y=1/x;
            System.out.println("This will not be printed" + y);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("End of try/catch block");
        }
    }
}
