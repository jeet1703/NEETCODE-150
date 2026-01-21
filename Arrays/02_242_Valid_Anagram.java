class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character,Integer> mp = new HashMap<>();
        for(char i : s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(char i: t.toCharArray()){
            if( mp.get(i) == null || mp.get(i) == 0){
                return false;
            }else{
                mp.put(i,mp.get(i)-1);
            }
           
        }
        return true;
    }
}