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
}