class Solution {
    public int digitFrequencyScore(int n) {
        String s = Integer.toString(n);
        int[] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(int num : map.keySet()){
            int d = num;
            int val = map.get(num);
            sum = sum+d*val;
        }
        return sum;
    }
}