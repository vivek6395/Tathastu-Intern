import java.util.*;
public class Problem2 {
   static int fib(int a)
    {
        if(a==1||a==2)
        {
            return a-1; 
        }
        else{
           return fib(a-1)+fib(a-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }   
}
