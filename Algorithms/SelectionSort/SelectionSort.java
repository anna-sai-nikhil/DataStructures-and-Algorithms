package Algorithms.SelectionSort;

public class SelectionSort {
    int[] a;

    public SelectionSort(int[] a) {
        this.a = a;
    }

    public void sort() {
        for(int i = 0 ; i < a.length ; i++) {
            int min_idx = i ;
            for(int j = i ; j < a.length ; j++) {
                if ( a[j] < a[min_idx]) min_idx = j;
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
    }

}
