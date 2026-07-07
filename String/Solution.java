package String;

public class Solution {
    public static void main(String[] args) {
        int n = 10203004;
        String num = String.valueOf(n);
        int x = 0;
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c != '0') {
                int digit = c - '0';
                x = x * 10 + digit;
                sum += digit;

            }
        }
        System.out.println(sum * x);
    }

}
