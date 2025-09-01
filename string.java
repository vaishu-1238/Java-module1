import java.util.*;
public class string {
    public static void main(String[] args) {
        System.out.println("Enter two string:");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
        if(str1.equals(str2))
        System.out.println("Str1 and str2 are equal");
        else
        System.out.println("str1 and str2 are not equal");

    }
    
}
