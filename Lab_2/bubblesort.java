package Lab_2;

import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k= arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(k=1; k < (n-i); k++){  
                          if(arr[k-1] > arr[k]){   
                                 temp = arr[k-1];  
                                 arr[k-1] = arr[k];  
                                 arr[k] = temp;  
                                }
                            }
                        }
    System.out.println("Array after bubble sort ");
   for(k=0; k <n; k++){ 
    System.out.println(arr[k]+"");
   }
   sc.close();
}
}

