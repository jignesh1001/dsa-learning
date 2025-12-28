class ReverseArray{
    public static void main(String[] args){
        int[] arr = {1,33,44,21,3,2,555,78,6,7,8};
        reverseArray(arr);
        for(int x:arr){
            System.out.print(x);
        }
    }
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}