class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        int temp[]=new int[26];
        for(int i=0;i<chars.length();i++)
        {
            temp[chars.charAt(i)-'a']++;
        }
        for(int i=0;i<words.length;i++)
        {
            int temp1[]=temp.clone();
            String str=words[i];
            int j=0;
            for(j=0;j<str.length();j++)
            {
                if(temp1[str.charAt(j)-'a']==0)
                {
                    break;
                }
                temp1[str.charAt(j)-'a']--;
            }
            if(j>=str.length())
            {
                count+=str.length();
            }
        }
        return count;
    }
}