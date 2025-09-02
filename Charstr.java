import java.util.*;
public class Charstr {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
    }
}
