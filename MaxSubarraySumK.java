class MaxSubarraySumK{
    public static void main(String args[]){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySumk(arr);
    }
    public static int maxSubarraySumk(int[] arr){
        // works for all cases 
         int maxSum = Integer.MIN_VALUE;
         int sum = 0;

         for(int i = 0;i < arr.length;i++){
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum < 0){
                sum = 0;
            }
         }
         System.out.println(maxSum);
        return maxSum;
    }
    // counter question can be asked 
    // to find subarray that gives maximum sum
    public static int kedane(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, ansStart=-1,ansEnd=-1;
    
        for(int i = 0; i < arr.length;i++){
           if(sum == 0) start = i;
           sum += arr[i];
           if(sum > maxSum){
              maxSum = sum;
              ansStart = start;
              ansEnd = i;
           }
           if(sum < 0){
            sum = 0;
           }
        }
        int[] ans = Arrays.copyOfRange(arr,ansStart,ansEnd+1);
        System.out.print(Arrays.toString(ans));
        System.out.println(maxSum);
        return maxSum;
    }
}