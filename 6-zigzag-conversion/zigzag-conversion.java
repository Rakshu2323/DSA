class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] row = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            row[i]=new StringBuilder();
        }
        int curr = 0;
        int direc = -1;
        for(char c : s.toCharArray()){
            row[curr].append(c);
            if(curr==0 || curr==numRows-1){
                direc = -direc;
            }
            curr += direc;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder rows : row){
            res.append(rows);
        }
        return res.toString();
    }
}