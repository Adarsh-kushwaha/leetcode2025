package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,8, 40, 56,78};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2){
        int tem = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tem;
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            swap(arr, start, end);
            start ++;
            end --;
        }
    }
}
  