package Algorithms.SelectionSort;

public class Main {
    public static void main(String[] args){
        int[] array = {9,8,7,1,7};
        var sort = new SelectionSort(array); 
        sort.sort();
        for(int i=0;i<array.length;i++) System.out.print(array[i]+" ");
        
    }
}
