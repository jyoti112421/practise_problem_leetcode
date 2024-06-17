class Solution {
    public boolean isPerfectSquare(int num) {
        // Calculate the square root of the number
        double sr = Math.sqrt(num);
        
        // Check if the square root is an integer
        return sr == (double)(int)sr;
    }
}