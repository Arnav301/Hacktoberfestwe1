class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxL=0;

        Set<Character> ans=new HashSet<>();

        for(int right=0;right<s.length();right++){
            while(ans.contains(s.charAt(right))){
                ans.remove(s.charAt(left));
                left++;
            }
            ans.add(s.charAt(right));
            maxL=Math.max(maxL,right-left+1);
        }
        return maxL;
    }
}
