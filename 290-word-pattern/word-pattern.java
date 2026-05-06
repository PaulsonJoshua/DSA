class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
        String tmp[]=s.split(" ");
        if(pattern.length()!=tmp.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(hm.containsKey(ch))
            {
                if(!(hm.get(ch).equals(tmp[i])))
                {
                    return false;
                }
            }
            else
            {
                if(hm.containsValue(tmp[i]))
                {
                    return false;
                }
                hm.put(ch,tmp[i]);
            }
        }
        return true;
    }
}