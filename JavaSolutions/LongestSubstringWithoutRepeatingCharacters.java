class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }
            map.put(currentChar, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}