package Algorithms.BubbleSort;

public class Main {
    public static void main(String[] args){
        int[] array = {9,7,6,2,4,7,3,1};
        var sort = new BubbleSortt(array);
        sort.sort();
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");

        }
        
    }
    
}
