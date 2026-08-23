class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder s = new StringBuilder(magazine);
        for(int i=0; i<ransomNote.length(); i++){
            char c1 = ransomNote.charAt(i);
            boolean found = false;
            for(int j=0; j<s.length(); j++){
                char c2 = s.charAt(j);
                if(c1==c2){
                    found = true;
                    s.deleteCharAt(j);
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}