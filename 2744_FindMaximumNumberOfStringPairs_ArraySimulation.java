class Solution {
    public String reverse(String s){
        String r = "";
        for(int i = s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        return r;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i =0; i< words.length; i++){
            for(int j =i+1; j<words.length; j++){
                if(words[i].equals(reverse(words[j]))) count++;
            }
        }
        return count;
    }
}
