public class interview {
    public static void main(String[] args) {
        // sorting algorithm using merge sort.
        int arr[] = {5, 4 ,1 ,3, 2};
        int l = 0;
        int size = arr.length;
        mergeSort(arr, 0, size);
    }
    static void mergeSort(int arr[], int l, int r){
        if(l>=r)return;
        int mid = l + (r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid , r);
    }
    static void merge(int arr[], int l, int mid, int r){
        int size1 = mid - l + 1;
        int size2 = r- mid;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int k=0;
        for(int i=l;i<mid;i++){
            arr1[k++] = arr[i];
        }
        k = 0;
        for(int i=mid;i<r;i++){
            arr2[k++] = arr[i];
        }
        int i=0, j=0;
        int pa = 0;
        k = 0;
        while(i<size1 && j<size2 ){
            if(arr[i]<=arr2[j]){
                arr[pa++] = arr1[i++];
            }else{
                arr[pa++] = arr2[j++];
            }
        }
        while(i<size1){
            arr[pa++] = arr1[i++];
        }
        while(j<size2){
            arr[pa++] = arr2[j++];
        }
    }
}

