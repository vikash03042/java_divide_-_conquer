
import java.util.Scanner;
public class Quicksort {
    public static void prnt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    // calling for quicksort
    public static void quickSort(int arr[],int si,int ei){
        int pidx= partition(arr,si,ei);
        if(si>=ei){
            return;
        }

        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);

    }
    // calling for partition
    public static int  partition(int arr[],int si,int ei){
int pivot=arr[ei];
int i=si-1;
for(int j=si;j<ei;j++){
    if(arr[j]<= pivot){

        i++;
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
i++;
int temp=pivot;
arr[ei]=arr[i];
arr[i]=temp;
return i; 
}

    public static void main(String args[]){
Scanner sc =new Scanner(System.in); 
System.out.println("Enter the size of the array");
 int size=sc.nextInt();
int[] arr= new int[size];   

System.out.println("Enter your array of size"+size+"for sorting");
for (int i = 0; i < size; i++) {
    arr[i]=sc.nextInt();
}
 int si=0;
 int ei=arr.length-1;

quickSort(arr, si, ei);
 prnt(arr);
}

}