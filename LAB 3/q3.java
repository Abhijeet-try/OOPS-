import java.util.*;


public class q3 {

    public static void main(String[] args) {
    
        Map<Integer,String> mp = new LinkedHashMap<Integer,String>();
    
        mp.put(1,"January");
    
        mp.put(2,"February");
        mp.put(3,"March");
        mp.put(4,"April");
        mp.put(5,"May");
        mp.put(6,"June");
        mp.put(7,"July");
        mp.put(8,"August");
        mp.put(9,"September");
        mp.put(11,"November");
        mp.put(12,"December");
        mp.put(10,"October");
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println("The month is : " + mp.get(n));
    
    
    }
    
}