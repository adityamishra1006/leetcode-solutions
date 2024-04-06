class Solution {
    public String minRemoveToMakeValid(String s) {
        int balance = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                balance++;
                sb.append(c);
            }else if(c == ')'){
                if(balance>0){
                    balance--;
                    sb.append(c);
                }
            } else{
                sb.append(c);
            }
        }
        while(balance-- >0){
            int index = sb.lastIndexOf("(");
            if(index != -1){
                sb.deleteCharAt(index);
            }
        }
        return sb.toString();
    }
}
