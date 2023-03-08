package Array;

public class Arraylist {
    private int[] arr = new int[5];
    private int count;

    public void insert(int item) {
        if (count >= arr.length) {
            resize();
        } 
            arr[count++] = item;
    }

    private void resize() {
        int[] arr1 = new int[count * 2];
        for (int i = 0; i < count; i++)
            arr1[i] = arr[i];
        arr = arr1;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < count - 1; i++)
            System.out.print(arr[i] + ",");
        System.out.print(arr[count - 1]);
        System.out.print("]");
    }

    public void removeAt(int index) {
        count--;
        for (int i = index; i < count; i++) {
            arr[i] = arr[i + 1];
        }

    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int max = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public void reverse() {
        var arr1 = new int[count];
        for (int i = 0; i < count; i++) {
            arr1[i] = arr[count - i - 1];
        }
        arr = arr1;
    }

    public void insertAt(int idx, int item) {
        // [1 2 3 4 5]
        //      4 5
        // [1 2 30 3 4 5]
        if (idx <= count) {
            if (count == arr.length)
                resize();
            for (int i = count-1; i >= idx; i--)
                arr[i+1] = arr[i];
            arr[idx] = item;
            count++;
        } else {
            int[] arr1 = new int[idx+1];
            for (int i = 0; i < count; i++)
                arr1[i] = arr[i];
            arr = arr1;
            arr[idx]=item;
            count=idx+1;
        }

    }
    public int[] intersection(int[] a){
        int dummy = (count>a.length) ? count : a.length;
        var dummya = new int[dummy];
        int dummycount=0;
        for(int i=0;i<count;i++){
            for(int j=0;j<a.length;j++){
                if(arr[i]==a[j]){
                    dummya[dummycount++]=arr[i];
                }
            }
        }
        return dummya;
    }

}