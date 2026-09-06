class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")) return false;
        int count=0;
        for(char c : s.toCharArray()){
            if(c=='A'){
                count++;
            }
        }
        if(count>=2) return false;
        return true;
    }
}