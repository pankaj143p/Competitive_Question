class Solution {
    public String reverseParentheses(String s) {

     Stack<Character>st=new Stack<>();
    //  StringBuilder rev=new StringBuilder();
       String Rev="";
     for(int i=0;i<s.length();i++){
         if(s.charAt(i)!=')'){
             st.push(s.charAt(i));
         }else{
             while(st.peek()!='('){
                Rev+=(st.pop());
             }
             st.pop();
            // String Rev=rev.toString();
             for(int k=0;k<Rev.length();k++){
                st.push(Rev.charAt(k));
             }
             Rev="";
         }
     }   
     while(!st.isEmpty()){
            Rev=st.pop()+Rev;
        }
        return Rev;
    }
}
