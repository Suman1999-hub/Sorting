import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=2;j<n;j++){
            int key=arr[j];
            int i=j-1;
            while(i>0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
