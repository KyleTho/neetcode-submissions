class Solution {
    public boolean isPalindrome(String s) {
        int pointer1 = 0;
        int pointer2 = s.length() - 1;

        String lowerS = s.toLowerCase();

        while (pointer1 < pointer2) {

            while (pointer1 < pointer2 && !alphaNum(s.charAt(pointer1))) {
                pointer1++;
            }
            while (pointer1 < pointer2 && !alphaNum(s.charAt(pointer2))) {
                pointer2--;
            }
            if (Character.toLowerCase(s.charAt(pointer1)) != Character.toLowerCase(s.charAt(pointer2))) {
                return false;
            }

            pointer1 += 1;
            pointer2 -= 1;

        }

        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
