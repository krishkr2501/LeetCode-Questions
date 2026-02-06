class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String[]> map = new HashMap<>();
        map.put('2', new String[] { "a", "b", "c" });
        map.put('3', new String[] { "d", "e", "f" });
        map.put('4', new String[] { "g", "h", "i" });
        map.put('5', new String[] { "j", "k", "l" });
        map.put('6', new String[] { "m", "n", "o" });
        map.put('7', new String[] { "p", "q", "r", "s" });
        map.put('8', new String[] { "t", "u", "v" });
        map.put('9', new String[] { "w", "x", "y", "z" });
        List<String> ans = new ArrayList<>();
        String fs = "";
        return backtrack(digits, map, ans, 0, fs);

    }

    private List<String> backtrack(String digits, HashMap<Character, String[]> map, List<String> ls, int i, String fs) {
        if (i == digits.length()) {
            if (!fs.isEmpty()) {
                ls.add(fs);
            }
            return ls;
        }

        char currentDigit = digits.charAt(i);
        String[] possibleLetters = map.get(currentDigit);

        if (possibleLetters != null) {
            for (String letter : possibleLetters) {
                backtrack(digits, map, ls, i + 1, fs + letter);
            }
        }
        
        return ls;
    }
}