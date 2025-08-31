import java.util.Scanner;
class size {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter"+size+"numbers:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("The array is:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"");
        }
        sc.close();
    }
    
}
