package Algorithms.BubbleSort;


public class BubbleSortt {
    int[] a;
    public BubbleSortt(int[] a) {
        this.a = a;
    }
    public void sort(){
        int count = 1;
        while(count!=0){
            count = 0;
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1]; a[i+1] = temp;
                    count++;
                }
            }

        }
        
    }

    
}
