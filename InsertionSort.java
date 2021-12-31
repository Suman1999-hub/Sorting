//Insertion Sort
/*
Input:
    5
    arr[]={12, 11, 13, 5, 6}
Output:
    5 6 11 12 13 
Explanation:
    (12, 11, 13, 5, 6)      Let us loop for i = 1 (second element of the array) to 4 (last element of the array) i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12 
    (11, 12, 13, 5, 6)      i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13 
    (11, 12, 13, 5, 6)        i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position. 
    (5, 11, 12, 13, 6)       i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position. 
    (5, 6, 11, 12, 13)
*/
import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<n;j++){
            int key=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key){
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
