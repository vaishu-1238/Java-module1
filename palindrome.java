import java.util.*;
public class palindrome {
    
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
       }
       if(str.equals(rev)){
        System.out.println("it is a palindrome");
       }
        else{
            System.out.println("it is not a palindrome");
        }
        
        }

    }

