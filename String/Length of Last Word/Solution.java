class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;

        // Start from the last character
        for (int i = s.length() - 1; i >= 0; i--) {

            // If current character is a space
            if (s.charAt(i) == ' ') {

                // If we have already started counting,
                // it means the last word has ended
                if (count > 0) {
                    break;
                }

                // Otherwise, ignore trailing spaces
                continue;
            }

            // Current character is a letter
            count++;
        }

        return count;
    }
}