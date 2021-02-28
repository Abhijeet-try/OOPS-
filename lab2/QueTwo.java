public class QueTwo
{
public static void main(String[] args)
{
int x = Integer.parseInt(args[0]);
String o = args[1];
int y = Integer.parseInt(args[2]);
int a = 0;
        
if (o.equals("+"))  
{
a = x + y;
} 
else if (o.equals("-"))
{
a = x - y;
}
else if (o.equals("*"))
{
a = x * y;
} 
else if (o.equals("/"))
{
a = x / y;
} 
else
{
System.out.println("invalid operation");
}
System.out.println(x+"  "+o+"  "+y+" = "+ a);

    
}

}
 