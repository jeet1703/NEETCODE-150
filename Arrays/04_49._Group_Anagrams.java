class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,List<String>> mp = new HashMap<>();
        for(int i =0;i<n;i++){
            int[] arr = new int[26];
            int size = strs[i].length();
            for(char c: strs[i].toCharArray()){
                arr[c-'a']++;
            }
            String hash = "";
            for(int j =0;j<26;j++){
                hash+='#';
                hash+=arr[j];
            }
            System.out.println(hash);
            if(mp.get(hash)== null){
                mp.put(hash,new ArrayList<>());
            }
            mp.get(hash).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}