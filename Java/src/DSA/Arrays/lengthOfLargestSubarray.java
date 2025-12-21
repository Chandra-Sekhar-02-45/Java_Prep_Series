package DSA.Arrays;

public class lengthOfLargestSubarray {
    public static void main(String[] args) {
        //No Duplicates. Largers Subarray in a number line order
        int[] arr = {4 , 3 , 1};
        int n = arr.length;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int mini = Integer.MAX_VALUE;
            int maxi = Integer.MIN_VALUE;
            for(int j = i; j < n; j++){
                mini = Math.min(mini, arr[j]);
                maxi = Math.max(maxi, arr[j]);
                if(maxi - mini == j - i ) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        System.out.println(maxLength);

    }
}
