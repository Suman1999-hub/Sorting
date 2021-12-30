//Selection Sort
/*
    Input:
        5
        arr[]={64,25,12,22,11}
    Output:
        11 12 22 25 64 
    Explanation:
        64 25 12 22 11
      => 11 25 12 22 64
      => 11 12 25 22 64
      => 11 12 22 25 64
*/

import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
