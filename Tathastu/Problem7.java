import java.util.*;
public class Problem7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        char arr1[]=new char[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            arr1[j]=arr[i];
            j=j+1;
        }
        for(char ar:arr1)
        {
            System.out.print(ar);
        }
    }
}