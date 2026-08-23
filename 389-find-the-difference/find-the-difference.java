class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder str = new StringBuilder(t);
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            for(int j=0; j<str.length(); j++){
                char c2 = str.charAt(j);
                if(c1==c2){
                    str.deleteCharAt(j);
                    break;
                }
            }
        }
        return str.charAt(0);
    }
}