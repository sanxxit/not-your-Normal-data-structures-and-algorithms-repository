public class binarysearces1 {
    public  static void main(String[]  args ){
        int oooo[]= {34,545,646,4324,6577,56657};
        int targetsss= 6577765;
        int ans = binarysearches(oooo, targetsss);
        System.out.println(ans );

    }
    //return index
    //retrun -1 if it doe not exist
    static  int binarysearches(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            // int mid = (start + end) /2;//might be posssibiliitly sometimes due to large
            //number of arrya sstartr +mid    ..may exceed the int range...
            //so
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid - 1;

            } else {
                return mid;
            }


        }
        return -1;


    }

}
