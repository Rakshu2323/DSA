class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String str1 = new String(c1);
        for(int i=0; i<=s2.length()-s1.length(); i++){
            String sub = s2.substring(i,i+s1.length());
            char[] c2 = sub.toCharArray();
            Arrays.sort(c2);
            String str2 = new String(c2);
            if(str2.equals(str1)) return true;
        }
        return false;
    }
}