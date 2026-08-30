class Solution {
    public String reverseWords(String s) {
        String[] sb = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for(int i=sb.length-1; i>=0; i--){
            str.append(sb[i]);
            if(i>0){
                str.append(" ");
            }
        }
        return str.toString();
    }
}