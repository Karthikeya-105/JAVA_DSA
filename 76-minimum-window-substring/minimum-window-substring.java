class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency of characters required from t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int formed = 0;
        int required = need.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            window.put(
                ch,
                window.getOrDefault(ch, 0) + 1
            );

            // This character has now satisfied its required frequency
            if (need.containsKey(ch)
                    && window.get(ch).intValue() == need.get(ch).intValue()) {
                formed++;
            }

            // Current window contains everything required
            while (formed == required) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                window.put(
                    leftChar,
                    window.get(leftChar) - 1
                );

                // We no longer satisfy this character's requirement
                if (need.containsKey(leftChar)
                        && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}