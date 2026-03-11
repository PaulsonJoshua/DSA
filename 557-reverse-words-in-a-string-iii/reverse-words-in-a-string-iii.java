class Solution {
    public String reverseWords(String s) {
    String temp="";
    StringBuilder tmp=new  StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch!=' ')
        {
        temp+=ch;
        }
        if(ch==' ')
        {
            StringBuilder ss=new StringBuilder(temp);
            tmp.append(ss.reverse()+" ");
            temp="";
        }
        if(i==s.length()-1)
        {
            StringBuilder st=new StringBuilder(temp);
            tmp.append(st.reverse());
        }
    }
    return tmp.toString();
    }
}