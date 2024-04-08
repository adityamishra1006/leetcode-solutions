class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int ones = 0;

        for(int student : students){
            if(student == 0) zero++;
            else ones++;
        }

        for(int sandwich : sandwiches){
            if(sandwich == 0){
                if(zero==0) break;
                zero--;
            }
            else{
                if(ones == 0) break;
                ones--;
            }
        }
        return zero + ones;
    }
}
