import java.util.*;



public class q4 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=40;i<250;i++)
        {
            if(i%5==0)
                arr.add(i);
        }

        System.out.println("Number divisible by 5 in range (40,250) are : ");
        for(Integer i : arr)
        {
            System.out.println(i);
        }

    }
}

