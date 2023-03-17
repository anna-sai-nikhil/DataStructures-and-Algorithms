package Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        var arr = new Arraylist();
        for(int i=1;i<11;i++) arr.insert(i);
        int[] arr1 = {1,2,3,4,9};
        arr.insertAt(15, 50);
        var k = arr.intersection(arr1);
        System.out.println(Arrays.toString(k));
    }

    
}
