class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        char[] arr = columnTitle.toCharArray();
        for(int i = 0; i< arr.length; i++)
        {
            sum = sum + (int)Math.pow(26, arr.length-i-1)* ((int)arr[i]-65 + 1);
        }
        return sum;
    }
}