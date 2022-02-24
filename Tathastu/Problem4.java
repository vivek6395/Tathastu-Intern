import java.util.*;
public class Problem4 {
    static String check(String s)
    {
        char ch[]=s.toCharArray();
        int n=ch.length;
        System.out.println(n);
        char[] b = new char[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = ch[i];
            j = j - 1;
        }
       String str=new String(ch);
       System.out.println(str);
       String str1=new String(b);
       System.out.println(b);
       if(str.intern()==str1.intern())
       {
           return "given String is palindrom";
       } 
       else
       {
           return "given String is not palindrom";
       }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(check(st));
    }
    
}
