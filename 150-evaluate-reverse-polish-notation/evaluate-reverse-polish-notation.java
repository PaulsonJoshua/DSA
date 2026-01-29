class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String str:tokens)
        {
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))
            {
                int operand2=st.pop();
                int operand1=st.pop();
                if(str.equals("+"))
                {
                    st.push(operand2+operand1);
                }
                else if(str.equals("-"))
                {
                    st.push(operand1-operand2);
                }
                else if(str.equals("*"))
                {
                    st.push(operand2*operand1);
                }
                else
                {
                    int val=(operand2!=0)?operand2:-1;
                    st.push((int)operand1/val);
                }
            }
            else
            {
                st.push(Integer.valueOf(str));
            }
        }
        return st.pop();
    }
}