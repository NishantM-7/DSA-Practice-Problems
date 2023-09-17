public class Leetcode1095 {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,3,1};
       int target = 3;
          int start = 0 ;
        int end = array.length -1;
        

    }


    static int binarySearch(int[] arr , int target,int start, int end){
     
      
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                start = mid+1;
            }else if(arr[mid] < target){
                end = mid -1;
            }else{
                return mid;
            }

        }
        return -1;
    }


}
