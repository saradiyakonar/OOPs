package Lab_7;

class CheckArgument extends Exception{
    int arg;
    CheckArgument(int x){
        arg=x;
    }
    public String toString(){
        return "Check Argument";
    }
}
public class Argument{
    static void argument(int x)throws CheckArgument{
        if(x<4)
            throw new CheckArgument(x);
    }
    public static void main(String [] args){
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=Integer.parseInt(args[2]);
            int d=Integer.parseInt(args[3]);
            int x = args.length;
            argument(x);
            System.out.println("Double = "+(a*a)+(b*b)+(c*c)+(d*d));
        }
        catch(CheckArgument e){
            System.out.println("Caught Exception" +e);
        }
    }
}


