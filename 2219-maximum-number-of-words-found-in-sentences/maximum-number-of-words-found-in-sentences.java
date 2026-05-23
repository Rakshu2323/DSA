class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxwords = 0;
        for(int i=0; i<sentences.length; i++){
            String[] words = sentences[i].split(" ");
            if(words.length>maxwords){
                maxwords = words.length;
            }
        }
        return maxwords;
    }
}