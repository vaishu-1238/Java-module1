import java.util.*;
class positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }

    }
}
