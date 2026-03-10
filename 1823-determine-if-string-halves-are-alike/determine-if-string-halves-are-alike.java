class Solution {
    public boolean halvesAreAlike(String s) {
     int count1=0,count2=0;
     String check="aeiou";
     s=s.toLowerCase();
     for(int i=0;i<s.length()/2;i++)
     {
        char ch=s.charAt(i);
        if(check.indexOf(ch)!=-1)
        {
            count1++;
        }
     }   
     for(int i=s.length()/2;i<s.length();i++)
     {
        char ch=s.charAt(i);
        if(check.indexOf(ch)!=-1)
        {
            count2++;
        }
     }
     if(count1==count2)
     {
        return true;
     }
     return false;
    }
}