class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder m = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                m.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = m.length()-1;

        while(left < right){
            if(m.charAt(left)!=m.charAt(right)){
                return false;
            }
            left++;right--;
        }

        return true;

    }
}
