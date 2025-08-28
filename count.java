import java.util.*;
class count{
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter the size of an array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        if(arr[i]>50){
            count=count+1;
        }
        System.out.println("The array which is greater than 50 are: " +count);

    }
}