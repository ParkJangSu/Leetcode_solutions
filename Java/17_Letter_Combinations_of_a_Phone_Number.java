class Solution {
    public ArrayList<String> list = new ArrayList<>();
    public char[][] arr = {
            {'0', '0', '0', '-'},
            {'0', '0', '0', '-'},
            {'a', 'b', 'c', '-'},
            {'d', 'e', 'f', '-'},
            {'g', 'h', 'i', '-'},
            {'j', 'k', 'l', '-'},
            {'m', 'n', 'o', '-'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v', '-'},
            {'w', 'x', 'y', 'z'},
        };
    
    public List<String> letterCombinations(String digits) {
        addString(digits, 0, "");
        return list;
    }
    
    public void addString(String digits, int index, String str) {
        if(digits.equals("")) return;
        if(index == digits.length()) {
            list.add(str);
        }
        else {
            for(int i = 0; i < 4; i++) {
                int number = Integer.parseInt(digits.charAt(index) + "");
                if(arr[number][i] == '-') continue;
                addString(digits, index + 1, str + arr[number][i]);
            }
        }
    }
}
