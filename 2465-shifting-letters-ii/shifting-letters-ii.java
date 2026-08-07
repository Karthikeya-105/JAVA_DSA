class Solution {
    public String shiftingLetters(String s, int[][] shifts) {

        int n = s.length();
        int[] diff = new int[n];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if (direction == 1) { 
                diff[start] += 1;
                if (end + 1 < n) {
                    diff[end + 1] -= 1;
                }
            } else { 
                diff[start] -= 1;
                if (end + 1 < n) {
                    diff[end + 1] += 1;
                }
            }
        }

        
        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }

        char[] result = s.toCharArray();

        
        for (int i = 0; i < n; i++) {
            int shift = diff[i] % 26;

            int pos = result[i] - 'a';
            pos = (pos + shift + 26) % 26;

            result[i] = (char) ('a' + pos);
        }

        return new String(result);
    }
}