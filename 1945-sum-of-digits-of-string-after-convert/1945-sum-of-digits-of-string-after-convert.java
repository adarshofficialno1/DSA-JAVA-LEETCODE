class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(char ch: s.toCharArray()){
            int n = ch - 'a' + 1;
            sum += n/10 + n%10;
        }
        k--;
        while(k--> 0){
            int temp = 0;
            while(sum>0){
                temp+=sum%10;
                sum/=10;
            }
            sum = temp;

        }
        return sum;
    }
}