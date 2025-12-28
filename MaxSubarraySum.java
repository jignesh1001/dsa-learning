// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MaxSubarraySum {
    public static void main(String[] args) {
        
        int[] arr = {2,4,6,8,10};
        int n = arr.length  ;
        maxSubarraySum(arr);
       
    }
    public static void maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length ;i++){
            for(int j = i; j < arr.length;j++){
                int sum = 0;
                for(int k = i; k <= j ; k++){
                    sum += arr[k];
                }
                System.out.println();
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum < minSum){
                    minSum = sum;
                }
       
            }
  
        }
              System.out.println(maxSum + " ");
              System.out.println(minSum + " ");
       
    }
}