class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        //String s = nextLine();
        for(int i=0; i<s.length()-1; i++){
            int asciiValue = s.charAt(i);
            int diff = Math.abs(s.charAt(i)-s.charAt(i+1));
            total += diff;
        }
        return total;
    }
}