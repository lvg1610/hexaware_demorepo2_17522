public class Calculator
{
    public static int sum(int x,int y)
    {
         return x+y;
    }
    public static int square(int x)
    {
         return x*x;
    }
    public static divide(int x,int y)
    {
        if(y!=0)
            return x/y;
        throw new ArithmeticException();
    }    
}    
