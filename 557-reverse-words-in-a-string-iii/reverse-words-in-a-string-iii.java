class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<str.length; i++){
            StringBuilder s2 = new StringBuilder(str[i]);
            s1.append(s2.reverse().toString());
            if(i<str.length-1) s1.append(" ");
        }
        return s1.toString();
    }
}