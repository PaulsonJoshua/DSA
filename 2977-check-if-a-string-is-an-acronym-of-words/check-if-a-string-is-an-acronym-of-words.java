class Solution {
    public boolean isAcronym(List<String> words, String s) {
        char temp[]=s.toCharArray();
        if(temp.length!=words.size())
        {
            return false;
        }
        for(int i=0;i<words.size();i++)
        {
            if(words.get(i).charAt(0)==temp[i])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}