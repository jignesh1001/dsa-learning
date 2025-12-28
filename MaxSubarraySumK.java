class MaxSubarraySumK{
    public static void main(String args[]){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySumk(arr);
    }
    public static maxSubarraySumk(int[] arr){
         // does not work for case where all elements
         // are negative
         int maxSum = Integer.MIN_VALUE;
         int sum = 0;

         for(int i = 0;i < arr.length;i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(sum,maxSum);
         }
         System.out.println(maxSum);

    }
}