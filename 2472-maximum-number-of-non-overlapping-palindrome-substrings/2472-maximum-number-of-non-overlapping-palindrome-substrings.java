class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length(), lastEnd = 0, count = 0;
        for (int c = 0; c < 2 * n; c++) {
            int left = c / 2;
            int right = left + c % 2;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= k) {
                    int end = right + 1;
                    if (left >= lastEnd) {
                        lastEnd = end;
                        count++;
                    } else {
                        lastEnd = Math.min(lastEnd, end);
                    }
                    break;
                }
                left--;
                right++;
            }
        }
        return count;
    }
}