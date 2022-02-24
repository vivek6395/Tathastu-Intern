import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>l=new ArrayList<>();
        l.add(18);
        l.add(45);
        l.add(4758);
        l.add(2329);
        l.add(1);
        System.out.print(l);
        System.out.println("\nenter index of number for delete");
        int d=sc.nextInt();
        l.remove(d);
        System.out.print(l);
    } 
}
