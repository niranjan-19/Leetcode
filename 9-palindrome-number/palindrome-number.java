class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int p1 = 0;
        int p2 = str.length() - 1;

        while (p2 > p1) {
            if (str.charAt(p1) != str.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;

        }
        return true;

    }
}