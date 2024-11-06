// Merge Sorting whose time complexity is  big oh of nlogn and space compelexity is big oh of n


public class mergeSort {
    // for print the final array
    public static void prnt(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
System.out.println();
    }

    // calling function for the merge sorting
    public static void MergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // for left part
        MergeSort(arr, si, mid);
        // for right part
        MergeSort(arr, mid + 1, ei);

        // call for another function for Merge the above left sorted part and right
        // sorted part
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int* arr[], int si, int mid, int ei) {
        int temp[] =new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid&&j<=ei)
        {
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
                 
            }
            else{
                temp[k]=arr[j];
                j++;
                

            }
            k++;
        }

        while (i<=mid) {
            temp[k++] =arr[i++];
        }

        while (j<=ei) {
            temp[k++]=arr[j++];

        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 1, 6, 8, 7 };
        int si=0;
        int ei=arr.length-1;
        MergeSort(arr,si, ei);
        prnt(arr);
    }
}