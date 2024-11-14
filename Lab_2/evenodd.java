package Lab_2;

public class evenodd {
    public static void main (String[] args){
        int [] arr = new int [10];
        for ( int i=0; i<10; i++){
            arr[i]= Integer.parseInt(args[i]);
        }
        int ecount =0;
        int ocount =0;
        for(int j=0; j<10; j++){
            if(arr[j]%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("The number of even numbers are "+ecount);
        System.out.println("The number of odd numbers are "+ocount);
        
    }
    
}
