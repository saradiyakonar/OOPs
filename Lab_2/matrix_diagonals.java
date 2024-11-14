package Lab_2;

import java.util.Scanner;
public class matrix_diagonals {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter the elements");
        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum_left=arr[0][0] + arr[1][1] + arr[2][2];
        int sum_right = arr[0][2] + arr[1][1] + arr[2][0];
        System.out.println("The sum of right diagonal = "+ sum_right);
        System.out.println("The sum of left diagonal = "+ sum_left);
    }
}
