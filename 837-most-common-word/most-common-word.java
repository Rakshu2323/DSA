class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = Arrays.toString(banned);
        String cparagraph = paragraph.toLowerCase().replaceAll("[!?',;.]"," ");
        String[] s1 = cparagraph.split("\\s+");
        List<String> list = new ArrayList<>();
        for(int i=0; i<s1.length; i++){
            if(!str.contains(s1[i])){
                list.add(s1[i]);
            }
        }
        int count = 0;
        Map<String,Integer> map = new HashMap<>();
        for(String s2 : list){
            map.put(s2,map.getOrDefault(s2,0)+1);
        }
        int min = Integer.MIN_VALUE;
        String ans = "";
        for(String s2 : map.keySet()){
            int num = map.get(s2);
            if(min<num){
                min = num;
                ans = s2;
            }
        }
        return ans;
    }
}