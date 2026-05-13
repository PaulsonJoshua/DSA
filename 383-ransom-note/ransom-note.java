class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char temp[]=new char[26];
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            temp[ch-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(temp[ransomNote.charAt(i)-'a']==0)
            {
                return false;
            }
            temp[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}