import java.util.*;
class sumofarray{
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the "+num+" array elements:");
        for(int i=0;i<num;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<num;i++)
        sum=sum+arr[i];
        System.out.println("Sum of array elements are: "+sum);
        int avg=sum/num;
        System.out.println("The average of elements is: " +avg);

    }
}