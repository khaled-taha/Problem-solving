
/*
Find the index of y where y is the first number greater than x
1 5 7 10       x = 6
*/

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(findIndex(new int[]{1, 5, 7, 10}, 4));

    }

    public static int findIndex(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;

        while (end >= start){
            int mid = (start + end) / 2;

            if(arr[mid] > x){
                return mid;
            } else{
                start = mid + 1;
            }

        }
        return -1;
    }
}
