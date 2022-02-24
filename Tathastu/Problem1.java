import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter operation");
        char c=sc.next().charAt(0);
        int result=0;
        switch(c)
        {
            case '+': result=a+b;
            break;
            case '-':result=a-b;
            break;
            case '/':result=a/b;
            break;
            case '*':result=a*b;
            default: System.out.println("enter valid operation");
        }
        System.out.println(result);
    }
    
}
