// Last updated: 09/07/2026, 09:18:43
class Solution {
    //readysync
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        return words[words.length-1].length();
    }
}