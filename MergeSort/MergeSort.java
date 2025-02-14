public class MergeSort {
    
    public static void conquer(int[] arr, int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];

        int ind1 = si; 
        int ind2 = mid + 1;
        int x = 0;

        while(ind1 <= mid && ind2 <= ei)
        {
            if(arr[ind1] <= arr[ind2])
            {
                merged[x++] = arr[ind1++];
            }else{
                merged[x++] = arr[ind2++];
            }
        }

        while(ind1 <= mid)
        {
            merged[x++] = arr[ind1++];
        }

        while(ind2 <= ei)
        {
            merged[x++] = arr[ind2++];
        }

        for(int i = 0, j = si; i < merged.length; i++, i++ )
        {
            arr[j] = merged[i];
        }
    }

    public static void conquer1(int[] arr, int si, int mid, int ei) {

        // Get length of arrays
        int n1 = mid - si + 1; 
        int n2 = ei - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Set sub arrays
        for(int i = 0; i < n1; i++)
        {
            L[i] = arr[si + i];
        }

        for(int j = 0; j < n2; j++)
        {
            R[j] = arr[mid + 1 + j];
        }

        int x = si, i = 0, j = 0;

        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                arr[x++] = L[i++];
            }else{
                arr[x++] = R[j++];
            }
        }

        while(i < n1)
        {
            arr[x++] = L[i++];
        }

        while(j < n2)
        {
            arr[x++] = R[j++];
        }

    }
    // 2 4 3 6 5, | 0 |, 4
    public static void divide(int[] arr, int si, int ei) {

        if(si >= ei)
        {
            return; 
        }

        int mid = si + (ei - si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer1(arr, si, mid, ei);
    }
 
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 3, 6};

        int n = arr.length;

        divide(arr, 0, n-1);
        
        String output = "";
        for(int i = 0; i < arr.length; i++)
        {
            output += arr[i] + " ";
        }
        System.out.println(output);
    }
}
