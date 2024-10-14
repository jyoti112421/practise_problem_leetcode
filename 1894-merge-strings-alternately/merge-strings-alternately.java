class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0; // Pointer for word1
        int j = 0; // Pointer for word2
        StringBuilder str = new StringBuilder();

        // Loop through both words until we reach the end of one
        while (i < word1.length() && j < word2.length()) {
            str.append(word1.charAt(i)); // Append char from word1
            str.append(word2.charAt(j)); // Append char from word2
            i++;
            j++;
        }

        // Append the remaining characters from word1, if any
        while (i < word1.length()) {
            str.append(word1.charAt(i));
            i++;
        }

        // Append the remaining characters from word2, if any
        while (j < word2.length()) {
            str.append(word2.charAt(j));
            j++;
        }

        return str.toString(); // Return the merged string
    }
}
