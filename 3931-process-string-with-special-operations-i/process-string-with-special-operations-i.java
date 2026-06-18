class Solution {
    public String processStr(String s) {
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s.charAt(i)=='#')
            {
                StringBuilder temp=new StringBuilder(sb1);
                sb1.append(temp); 
            }
            else if(s.charAt(i)=='%')
            {
                String rev=sb1.reverse().toString();
                sb1=new StringBuilder(rev);
            }
            else if(s.charAt(i)=='*' && !sb1.isEmpty())
            {
                sb1.deleteCharAt(sb1.length()-1);
            }
            else if(Character.isLowerCase(ch))
            {
                sb1.append(ch);
            }
        }
        return sb1.toString();
    }
}