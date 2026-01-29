class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String dir[]=path.split("/");
        for(String temp:dir)
        {
            if(temp.equals(".") || temp.isEmpty())
            continue;
            else if(temp.equals("..") ){
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else
            st.push(temp);
        }
        return "/"+String.join("/",st);
    }
}