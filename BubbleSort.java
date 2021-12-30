//Bubble Sort
/*
Input:
    5
    arr[]={5, 1, 4, 2, 8}
Output:
    1 2 4 5 8
Explanation:
    First Pass: 
        ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 )
        ( 1 5 4 2 8 ) –> ( 1 4 5 2 8 )
        ( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ) 
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
    Second Pass: 
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
        ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 )
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
    Third Pass: 
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
*/
import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
