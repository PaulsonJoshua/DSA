class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words)
        {
            boolean bool=false;
            bool=isPalindrome(str);
            if(bool)
            {
                return str;
            }
            else
            {
                continue;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<=right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}