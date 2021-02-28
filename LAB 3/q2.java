import java.util.ArrayList;

import java.util.Scanner;


public class q2 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> arr = new ArrayList<Integer>();


        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            arr.add(d);
        }

        sc.close();

        int sum  = 0;
        for(int i : arr){
         sum = sum + i*i;
        System.out.print(i*i + " ");

        }


        System.out.println("\nSquare of number has sum : " + sum);
    }
}