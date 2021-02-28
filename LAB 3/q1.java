import java.util.*;
// permutations

public class q1 {

    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");

        System.out.print("\n");
    }


    public static void swap(int[] arr,int i,int index)
    {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void findPermutation(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            print(arr);
            return;
        }

      

        for(int i=index;i<arr.length;i++)
        {
            swap(arr,i,index);
            findPermutation(arr, index+1);
            swap(arr,i,index);
        }
    }


	public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        int [] arr = new int[3];

        for(int i=0;i<3;i++)
        {
            arr[i] = sc.nextInt();
        }
	System.out.println("\nAll combination are : ");
        findPermutation(arr,0);
        
    }
    
}